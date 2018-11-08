/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author 2099190
 */
public class Intention implements Serializable{
    
    private int id;
    private int estado;
    private String nombre;
    private String descripcion;
    private Date fechaCreacion;
    private String tags;
    private User autor;
    private String palabrasClave;
    private ArrayList<Comment> comments;
    private String area;
           
    //TO-DO, Correct variables and methods    

    public Intention(int id, int estado, String nombre, String descripcion, Date fechaCreacion,ArrayList<Comment> comentarios,String palabrasClave, User autor,String area) {
        this.id = id;
        this.estado = estado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.palabrasClave = palabrasClave;
        this.comments = comentarios;
        this.autor = autor;
        this.area = area;        
    }

    public Intention(int id2, int estado2, String nombre2, String descripcion2, Date now,
			String palabrasClave2, User usuario,String area) {
    	this.id = id2;
        this.estado = estado2;
        this.nombre = nombre2;
        this.descripcion = descripcion2;
        this.fechaCreacion = now;
        this.palabrasClave = palabrasClave2;
        this.autor = usuario;
        this.area = area;
	}

	public int getId() {
        return id;
    }

    public Intention() {
    }
    

    public void setId(int id) {
        this.id = id;
    }



    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    

    public User getUsuario_documento() {
        return autor;
    }

    public void setUsuario_documento(User autor) {
        this.autor = autor;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public void setpalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
    
    
    public ArrayList<Comment> getComentarios(){
    	return comments;
    }
    public void setComentarios(ArrayList<Comment> comentarios) {
    	this.comments = comentarios;
    }
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "Item{" + " id= " + id + ", estado=" + estado + ", nombre=" + nombre + ",descripcion=" + descripcion + ", fechaCreacion=" + fechaCreacion + ", palabrasclave=" + palabrasClave+", autor="+autor+",area="+area+"}";
    }

}
