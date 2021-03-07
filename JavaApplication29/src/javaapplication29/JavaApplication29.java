/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author eucog
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Libro newLibro;
        newLibro = new Libro();
        
        System.out.print("Titulo: ");
        newLibro.setTitulo(entrada.next());
        System.out.print("Edicion: ");
        newLibro.setEdicion(entrada.next());
        System.out.print("Editorial ");
        newLibro.setAutor(entrada.next());
        System.out.print("Pais: ");
        newLibro.setPais(entrada.next());
        System.out.print("Pagina: ");
        newLibro.setPaginas(entrada.next());
        System.out.print("Fecha: ");
        newLibro.setFecha(entrada.next());
        System.out.print("ISBM: ");
        newLibro.setiSBM(entrada.next());

        System.out.println("Titulo: "+newLibro.getTitulo());
        System.out.println("Titulo: "+newLibro.getEdicion());
        System.out.println("Titulo: "+newLibro.getAutor());
        System.out.println("Titulo: "+newLibro.getPais());
        System.out.println("Titulo: "+newLibro.getPaginas());
        System.out.println("Titulo: "+newLibro.getFecha());
        System.out.println("Titulo: "+newLibro.getiSBM());
        
        
    }
    
}
