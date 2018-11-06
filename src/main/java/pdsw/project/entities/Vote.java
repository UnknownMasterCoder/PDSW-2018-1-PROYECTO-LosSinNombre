package pdsw.project.entities;

public class Vote {
    private int id;
    private boolean like_dislike;
    private User usuario;
    private Intention intencion;

    public Vote(int id, boolean like_dislike, User usuario, Intention intencion) {
        this.id = id;
        this.like_dislike = like_dislike;
        this.usuario = usuario;
        this.intencion = intencion;
    }

    public Vote() {
    }        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLike_dislike() {
        return like_dislike;
    }

    public void setLike_dislike(boolean like_dislike) {
        this.like_dislike = like_dislike;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Intention getIntencion() {
        return intencion;
    }

    public void setIntencion(Intention intencion) {
        this.intencion = intencion;
    }
    
    
}
