package edu.eci.pdsw.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;


@ManagedBean(name = "loginBean")
@SessionScoped  
public class LoginBean extends BasePageBean{

    private String mail;
    private String password;

    public LoginBean() {
        mail = null;
        password = null;
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
