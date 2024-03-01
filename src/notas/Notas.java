/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import modelo.AlumnoDAO;
import pojos.Alumno;
import vistas.Vista;

/**
 *
 * @author Usuario
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas ppal = new Notas();
        Vista v = new Vista();
        int opcion = -99;

        do{
            opcion = v.pideOpcion();
            switch (opcion)
            {
                case 1:
                    ppal.insertarAlumno();
                    break;
                case 2:
                    ppal.borrarAlumno();
                    break;
                case 3:
                    ppal.modificarMovil();
                    break;
                case 4:
                    ppal.mostrarAlumnosPorAsignatura();
                    break;
                case 5:
                    ppal.mostrarAsignaturasYNotasDeAlumno();
                    break;
            }
        }while (opcion != 0);
    }

    private void insertarAlumno() {
        Vista v = new Vista();
        AlumnoDAO aDAO = new AlumnoDAO();
        
        Alumno a = v.pideAlumno();
        aDAO.guardaAlumno(a);
    }

    private void borrarAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void modificarMovil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mostrarAlumnosPorAsignatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mostrarAsignaturasYNotasDeAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
