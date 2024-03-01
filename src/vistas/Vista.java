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
        n=v.muestraMenu();
        return n;
    }

    public Alumno pideAlumno() {
        Alumno a = new Alumno();
        
    }

    private int muestraMenu() {
        Vista v = new Vista();
        int n = -99;
        
            System.out.println("1. Mostrar asignaturas y notas de alumno. ");
            System.out.println("1. Mostrar alumnos por asignatura. ");
            System.out.println("1. Modificar móvil de alumno. ");
            System.out.println("2. Borra alumno. ");
            System.out.println("1. Inserta alumno. ");
            return n = v.pideNumero();       
    }

    private int pideNumero() {
        String numero = "";
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca numero de opcion -> ");
            numero = sc.nextLine();
            if(esNumerico(numero)){
                correcto = true;
            }else{
                correcto = false;
            }
            
        }while(!correcto);
        return Integer.parseInt(numero);
    }

    private boolean esNumerico(String numero) {
        return numero != null && numero.matches("[-+]?\\d*\\.?\\d+");
    }
    
    
}
