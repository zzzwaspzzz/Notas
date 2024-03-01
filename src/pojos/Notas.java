package pojos;
// Generated 01-mar-2024 12:26:04 by Hibernate Tools 4.3.1



/**
 * Notas generated by hbm2java
 */
public class Notas  implements java.io.Serializable {


     private NotasId id;
     private Alumno alumno;
     private Asignatura asignatura;
     private Integer nota;

    public Notas() {
    }

	
    public Notas(NotasId id, Alumno alumno, Asignatura asignatura) {
        this.id = id;
        this.alumno = alumno;
        this.asignatura = asignatura;
    }
    public Notas(NotasId id, Alumno alumno, Asignatura asignatura, Integer nota) {
       this.id = id;
       this.alumno = alumno;
       this.asignatura = asignatura;
       this.nota = nota;
    }
   
    public NotasId getId() {
        return this.id;
    }
    
    public void setId(NotasId id) {
        this.id = id;
    }
    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Asignatura getAsignatura() {
        return this.asignatura;
    }
    
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    public Integer getNota() {
        return this.nota;
    }
    
    public void setNota(Integer nota) {
        this.nota = nota;
    }




}

