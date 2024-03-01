/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.Scanner;
import pojos.Alumno;

/**
 *
 * @author Usuario
 */
public class Vista {

    public int pideOpcion() {
        Vista v = new Vista();
        int n = 0;
        n = v.muestraMenu();
        return n;
    }

    public Alumno pideAlumno() {
        Vista v = new Vista();

        Alumno a = new Alumno();

        a.setNombre(v.pideNombre());
        
        a.setApellidos(v.pideApellidos());
        
        return a;
    }

    private int muestraMenu() {
        Vista v = new Vista();
        int n = -99;
        System.out.println("*********************************************");
        System.out.println("* 5. Mostrar asignaturas y notas de alumno. *");
        System.out.println("* 4. Mostrar alumnos por asignatura.        *");
        System.out.println("* 3. Modificar móvil de alumno.             *");
        System.out.println("* 2. Borra alumno.                          *");
        System.out.println("* 1. Inserta alumno.                        *");
        System.out.println("*********************************************");
        System.out.println("* 0. Salir.                                 *");
        System.out.println("*********************************************");
        return n = v.pideNumero();
    }

    private int pideNumero() {
        String numero = "";
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Introduzca numero de opcion -> ");
            numero = sc.nextLine();
            if (esNumerico(numero))
            {
                correcto = true;
            } else
            {
                correcto = false;
                System.out.println("Inserte solo numeros, por favor. ");
            }

        } while (!correcto);
        return Integer.parseInt(numero);
    }

    private boolean esNumerico(String numero) {
        return numero != null && numero.matches("[-+]?\\d*\\.?\\d+");
    }

    private String pideNombre() {
        Vista v = new Vista();
        System.out.println("Nombre de alumno -> ");
        return v.pideTexto();
    }

    private String pideTexto() {
        boolean correcto = false;
        String texto = "";
        do{
            Scanner sc = new Scanner(System.in);
            texto = sc.nextLine();
            if (esTexto(texto))
            {
              correcto = true;  
            }else{
                correcto = false;
                System.out.println("Inserte solo letras, por favor. ");
            }
        } while (!correcto);
        return texto;
    }

    private boolean esTexto(String texto) {
        return texto != null && texto.matches("[a-zA-Z]");
    }

    private String pideApellidos() {
        Vista v = new Vista();
        System.out.println("Apellidos del alumno -> ");
        return v.pideTexto();
    }

}
