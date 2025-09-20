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
public class promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        int calTra, numCal, sumCal=0;
        double prom;
        String alum;
        char continuar;
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner= new Scanner(System.in);
        
        do{
        System.out.println("Ingrese el nombre del alumno");
        alum=entrada.readLine();
            System.out.println("Cuantas calificaiones desea promediar?");
            numCal=Integer.parseInt(entrada.readLine());
            
            
            for (int i = 1; i <=numCal; i++) {
                System.out.println("Ingrese la califcaion "+i+": ");
                calTra=Integer.parseInt(entrada.readLine());
                sumCal+=calTra;  
        }
                prom=sumCal/numCal; 
                System.out.println("El promedio final del alumno "+alum+" es de: "+prom);
                System.out.println("Desea calcular otro promedio? (s/n)");
                continuar=scanner.next().toLowerCase().charAt(0);
        } while (continuar=='s');
    }
}
