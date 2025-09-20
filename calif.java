/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author macha
 */
import java.io.*;
import java.util.Scanner;

public class calif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
       BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
       Scanner scanner=new Scanner(System.in);
       int calTra, numCal;
       double cal=0, calFin;
       String nomAlum;
       char continuar;
       
       do{
        System.out.println("Ingrese el nombre del alumno");
        nomAlum=entrada.readLine();
        System.out.println("Cuantas calificaciones desea promediar?");
        numCal=Integer.parseInt(entrada.readLine());
        
        for (int i = 1; i <= numCal; i++) {
            System.out.println("Ingrese el numero: "+i+": ");
            calTra=Integer.parseInt(entrada.readLine());
            cal+=calTra;
        }
        
            calFin=cal/numCal;
            
            System.out.println("La calificaion final de "+nomAlum+" es de: "+calFin);
            
            System.out.println("Desea calcular otro promedio? s/n");
            continuar=scanner.next().toLowerCase().charAt(0);
       } while (continuar=='s');
    }
    
}
