package pojos;
// Generated 01-mar-2024 12:26:04 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Alumno generated by hbm2java
 */
public class Alumno  implements java.io.Serializable {


     private int codAlu;
     private String nombre;
     private String apellidos;
     private Set notases = new HashSet(0);
     private Set telefonoses = new HashSet(0);

    public Alumno() {
    }

	
    
    public Alumno(String nombre, String apellidos, Set notases, Set telefonoses) {       
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.notases = notases;
       this.telefonoses = telefonoses;
    }
   
    public int getCodAlu() {
        return this.codAlu;
    }    
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Set getNotases() {
        return this.notases;
    }
    
    public void setNotases(Set notases) {
        this.notases = notases;
    }
    public Set getTelefonoses() {
        return this.telefonoses;
    }
    
    public void setTelefonoses(Set telefonoses) {
        this.telefonoses = telefonoses;
    }




}

