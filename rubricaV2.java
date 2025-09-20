package rubrica2;
/*Crear una rubrica que saque el % de calificacion de un alumno, que pregunte por el maximo de criterios de cada rubro y el puntaje obtenido por el alumno
Criterios a evaular: examen 30%, asistencia 10%, practicas 30%, participacion 10%, proyecto 20%*/
import java.io.*;
import java.util.Scanner;
public class rubricaV2 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader datos = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        //Definimos las variables de cada rubro obtenidas por el alumno
        int acExam, numAsis, numPract, numPart, calProy;
        //definimos el maximo de criterios a obtener de cada rubro
        int maxExam, maxAsis, maxPract, msxPart, maxCalProy;
        //definimos el valor en% de cada rubro
        int valExam, valAsis, valPract, valPart, valProy, valTot = 0;
        //Variables finales de suma y de almacenamiento de datos
        double calFin=0, exam, asis, pract, part, proy;
        String alumno;
        
        
        //Asignacion de los valores maximos de cada rubro
        System.out.println("Bienvenido akumno, por favor ingrese su nombre");
        alumno=datos.readLine();
        do{
        System.out.println("Ingrese el% de valor maximo del examen");
        valExam=Integer.parseInt(datos.readLine());
        valTot+=valExam;
        System.out.println("Ingrese el % de valor maximo de las asistencias");
        valAsis=Integer.parseInt(datos.readLine());
        valTot+=valAsis;
        System.out.println("Ingrese el % de valor maximo de las practicas");
        valPract=Integer.parseInt(datos.readLine());
        valTot+=valPract;
        System.out.println("Ingrese el % de valor maximo de las participaciones");
        valPart=Integer.parseInt(datos.readLine());
        valTot+=valPart;
        System.out.println("Ingrese el % de valor maximo del proyecto de unidad");
        valProy=Integer.parseInt(datos.readLine());
        valTot+=valProy;
        if (valTot==100){
                } else {
            System.out.println("Ingrese valores correctos");
            }
        } while (valTot !=100); 
        
        //pedir los valores maximos de cada rubro
        System.out.println("Ingrese los aciertos maximos en el examen");
        maxExam=Integer.parseInt(datos.readLine());
        System.out.println("Ingrese el numero maximo de asistencias");
        maxAsis=Integer.parseInt(datos.readLine());
        System.out.println("Ingrese el numero maximo de practicas");
        maxPract=Integer.parseInt(datos.readLine());
        System.out.println("Ingrese el numero maximo de participaciones");
        msxPart=Integer.parseInt(datos.readLine());
        System.out.println("Ingrese la calificaion maxima en el proyecto de unidad");
        maxCalProy=Integer.parseInt(datos.readLine());
        
        //Pedir al alumno lo obtenido en sus criterios
        System.out.println("Ingrese sus aciertos en el examen");
        acExam=Integer.parseInt(datos.readLine());
        System.out.println("Ingrese su numero de asistencias");
        numAsis=Integer.parseInt(datos.readLine());
        System.out.println("Ingrese su numero de practicas");
        numPract=Integer.parseInt(datos.readLine());
        System.out.println("Ingrese su numero de participaciones");
        numPart=Integer.parseInt(datos.readLine());
        System.out.println("Ingrese su calificaion en el proyecto de unidad");
        calProy=Integer.parseInt(datos.readLine());
        
        //calculos para saber la calificaion final
        exam=acExam*maxExam/valExam;
        calFin+=exam;
        asis=numAsis*maxAsis/valAsis;
        calFin+=asis;
        pract=numPract*maxPract/valPract;
        calFin+=pract;
        part=numPart*msxPart/valPart;
        calFin+=part;
        proy=calProy*maxCalProy/valProy;
        calFin+=proy;
        
        //impresion de resultados
        System.out.println("Alumno "+alumno+", su calificaion total es de: "+calFin);
        if (calFin >=70){
                System.out.println("Aprobaste!!!, felicidades");
        } else {
            System.out.println("En esta unidad, estas en sumativa");
        }
    }
    
}
