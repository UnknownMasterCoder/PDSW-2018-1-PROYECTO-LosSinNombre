package pdsw.project.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import pdsw.project.services.InitiativeBankServices;


@ManagedBean (name = "loginBean")
@RequestScoped
public class LoginBean extends BasePageBean{
    
        @ManagedProperty(value = "#{param.contrasenia}")
	private String contrasenia;
    
        @ManagedProperty(value = "#{param.mail}")
       	private String mail;

        private static final long serialVersionUID = 35L;

        @Inject
	private InitiativeBankServices initiativeBankServices;
        
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
