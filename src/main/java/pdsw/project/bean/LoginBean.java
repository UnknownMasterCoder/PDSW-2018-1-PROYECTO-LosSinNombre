package pdsw.project.bean;

import com.google.inject.Inject;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import pdsw.project.entities.User;
import pdsw.project.services.InitiativeBankException;
import pdsw.project.services.InitiativeBankServices;


@SuppressWarnings("deprecation")

@RequestScoped
public class LoginBean extends BasePageBean{
    
        @ManagedProperty(value = "#{param.contrasenia}")
	private String contrasenia;
    
        @ManagedProperty(value = "#{param.mail}")
       	private String mail;

        private static final long serialVersionUID = 35L;

        @Inject
	private InitiativeBankServices initiativeBankServices;
        
        
        
        public void autenticacion() throws IOException, InitiativeBankException {
        User usuarioTemp = new User();
        try {
            System.out.println("hola estoy dentro");
            usuarioTemp = initiativeBankServices.consultarUsuario(mail);
            if (contrasenia.equals(usuarioTemp.getContrasenia())) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("menuPrincipal.xhtml");
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Contraseña incorrecto.", "Ingrese la contraseña de nuevo."));
            }
        }catch (InitiativeBankException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, ex.getMessage(), "Cree un usuario."));
        }
    
    }
        
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
