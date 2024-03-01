/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import modelo.AlumnoDAO;
import modelo.AsignaturaDAO;
import pojos.Alumno;
import pojos.Asignatura;

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
        System.out.println("\n\nIntroduzca numero de opcion -> ");
        return n = v.pideNumero();
    }
       
    private int pideNumero() {
        String numero = "";
        boolean correcto = false;
        do{
            Scanner sc = new Scanner(System.in);
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
    
    private String pideTextoNumerico() {
        boolean correcto = false;
        String texto = "";
        do{
            Scanner sc = new Scanner(System.in);
            texto = sc.nextLine();
            if (esTextoNumerico(texto))
            {
              correcto = true;  
            }else{
                correcto = false;
                System.out.println("Inserte solo numeros, por favor. ");
            }
        } while (!correcto);
        return texto;
    }
    
    private String pideCaracter() {
        boolean correcto = false;
        String texto = "";
        do{
            Scanner sc = new Scanner(System.in);
            texto = sc.nextLine();
            if (esCaracter(texto))
            {
              correcto = true;  
            }else{
                correcto = false;
                System.out.println("Inserte solo letras, por favor. ");
            }
        } while (!correcto);
        return texto;
    }
    
    private boolean esNumerico(String numero) {
        return numero != null && numero.matches("[-+]?\\d*\\.?\\d+");
    }
    
    private boolean esCaracter(String texto) {
        return texto != null && texto.matches("[snSN]");
    }
    
    private boolean esTexto(String texto) {
        return texto != null && texto.matches("[a-zA-Z]+");
    }
    
    private boolean esTextoNumerico(String cadena) {
        return cadena != null && cadena.matches("\\d+");
    }
    
    public Alumno pideAlumno() {
        Vista v = new Vista();        

        Alumno a = new Alumno();

        a.setNombre(v.pideNombre());
        
        a.setApellidos(v.pideApellidos());
        
        a.setNotases(v.pideNotas());
        
        a.setTelefonoses(v.pideTelefonos());
        
        return a;
    }   

    private String pideNombre() {
        Vista v = new Vista();
        System.out.println("Nombre de alumno -> ");
        return v.pideTexto();
    }

    private String pideApellidos() {
        Vista v = new Vista();
        System.out.println("Apellidos del alumno -> ");
        return v.pideTexto();
    }

    private Set pideNotas() {
        Vista v = new Vista();
        List<Asignatura> listaAsignaturas = new AsignaturaDAO().obtenListaAsignaturas();
        Set<Integer> listaDeNotas = new HashSet<>();
        for (int i = 0; i < listaAsignaturas.size(); i++)
        {
            System.out.println("Nota de la asignatura "+listaAsignaturas.get(i).getNombreAsignatura()+" -> ");
            listaDeNotas.add(v.pideNumero());
        }
        return listaDeNotas;
    }

    private Set pideTelefonos() {
        Vista v = new Vista();
        Set<String> listaTelefonos = v.solicitaUnTelefono();
        return listaTelefonos;
        
    }

    private Set<String> solicitaUnTelefono() {
        Vista v = new Vista();
        Set<String> listaTelefonos = new HashSet<>();
        boolean suficiente = false;
        String cadena = "";
        do{
            System.out.println("Introduzca un numero de telefono -> ");
            cadena = v.pideTextoNumerico();
            if(esTextoNumerico(cadena)){
                listaTelefonos.add(cadena);
                suficiente = v.preguntarMasTelefonos();
            }            
        }while(!suficiente);
        return listaTelefonos;
    }

    private boolean preguntarMasTelefonos() {
        Vista v = new Vista();
        Scanner sc = new Scanner(System.in);
        boolean evaluacion = false;
        System.out.println("¿Desea añadir mas telefonos para este alumno? \ns/n");
        String respuesta = v.pideCaracter();
        if(respuesta.equalsIgnoreCase("s")){
            evaluacion = false;
        }else if(respuesta.equalsIgnoreCase("n")){
            evaluacion = true;
        }
        return evaluacion;
    }

    

}
