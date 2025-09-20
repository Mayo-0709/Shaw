/*firmas 30, examen 30, asistencia 20, participaciones 20
firmas maximas 20, aciertos maximos examen 50, asistencias maximas 10, participaciones maximas 10
*/
package test;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException
    {
     BufferedReader calif= new BufferedReader(new InputStreamReader(System.in));
     int fir, exam, part, asis;
     double totFir, totExam, totPart, totAsis, calFir, calExam, calPart, calAsis, calFin;
     String nombre;
        
     System.out.println("!Bienvenido estudiante!, Cual es tu nombre?");
        nombre=calif.readLine();
        System.out.println("Ingrese su numero de firmas");
        fir=Integer.parseInt(calif.readLine());
        System.out.println("Ingrese su numero de aciertos en el examen");
        exam=Integer.parseInt(calif.readLine());
        System.out.println("Ingrese su numero de participaciones");
        part=Integer.parseInt(calif.readLine());
        System.out.println("Ingrese su numero de asistencias en esta unidad");
        asis=Integer.parseInt(calif.readLine());
      
        totFir=20; totExam=50; totPart=10; totAsis=10;
      
        calFir=fir*30/totFir;
        calExam=exam*30/totExam;
        calPart=part*20/totPart;
        calAsis=asis*20/totAsis;
        calFin=calExam+calPart+calAsis+calFir;
        
        System.out.println("!Bienvenido! "+nombre+", tu calificaion final es: "+calFin);
        
        if (calFin>=70) {
            System.out.println("!APROBASTE! , Felicidades");
        } else {
            System.out.println("Reprobaste, intentalo la proxima vez en sumativas");
        }
    }
    
}
