package pdsw.project.entities;

public class User {
    private String full_name;
    private String email;
    private String areaDepartment;
    private Intention intencion;

    public User(String full_name, String email, String areaDepartment, Intention intencion) {
        this.full_name = full_name;
        this.email = email;
        this.areaDepartment = areaDepartment;
        this.intencion = intencion;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAreaDepartment() {
        return areaDepartment;
    }

    public void setAreaDepartment(String areaDepartment) {
        this.areaDepartment = areaDepartment;
    }

    public Intention getIntencion() {
        return intencion;
    }

    public void setIntencion(Intention intencion) {
        this.intencion = intencion;
    }
    
    
}
