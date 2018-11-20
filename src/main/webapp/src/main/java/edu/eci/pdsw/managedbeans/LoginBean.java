package edu.eci.pdsw.managedbeans;

import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.services.InitiativeBankException;
import edu.eci.pdsw.services.InitiativeBankServices;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


@ManagedBean(name = "loginBean")
@SessionScoped  
public class LoginBean extends BasePageBean{
    
    @Inject
    private InitiativeBankServices initiativeBankServices;

    private String mail;
    private String password;

    public LoginBean() {
        mail = null;
        password = null;
    }
    
    public void autenticacion() throws IOException, InitiativeBankException {
        User usuarioTemp = new User();
        try {
            System.out.println("hola estoy dentro");
            usuarioTemp = initiativeBankServices.consultarUsuario(mail);
            System.out.println(usuarioTemp.toString());
            if (password.equals(usuarioTemp.getContrasenia())) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("menuPrincipal.xhtml");
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Contraseña incorrecto.", "Ingrese la contraseña de nuevo."));
            }
        }catch (InitiativeBankException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, ex.getMessage(), "Cree un usuario."));
        }    
    }
    
    public void print(){
        System.out.println("mail ingresado: "+mail);
        System.out.println("contraseña ingresado: "+password);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        System.out.println(mail);
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
    
}
