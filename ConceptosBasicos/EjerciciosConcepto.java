package Sololearn.ConceptosBasicos;

import java.util.Scanner;

public class EjerciciosConcepto {
    public static void main(String[] args) {

        /* Código que genera las propiedades de un vehículo.*/

        String name = "Toyota";
        double  engine = 4.7;
        int  year = 2019;

        System.out.println("Name: " + name);
        System.out.println("Engine: " + engine);
        System.out.println("Year: " + year);


        /* Un cantinero vendió 64 botellas de cerveza y 23 botellas de whisky. Necesita calcular cuántas botellas en total se venden.*/

        int beer  = 64;
        int whisky = 23;

        int result = beer + whisky ;
        System.out.println("Se vendieron " + result + " botellas");

        /*Tom y Bob están jugando un juego de mesa, en el que ambos jugadores comienzan con el mismo número de puntos. Tom ganó el primer
          juego y obtuvo 1 punto, mientras que Bob perdió el juego y, por lo tanto, perdió 1 punto.
          Se le proporciona un programa que pretende tomar la puntuación inicial y aumentar la puntuación de Tom en 1 y disminuir la puntuación de Bob en 1.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int initScore = scanner.nextInt();
        int scoreTom = initScore;
        int scoreBob = initScore;

        System.out.println("Round 1 results:");
        System.out.println(scoreTom+1);
        System.out.println(scoreBob-1);



        /* Necesitas un programa para convertir días a segundos. El código dado toma la cantidad de días como entrada.
           10Complete el código para convertirlo a segundos y generar el resultado.*/
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce cantidad de dias");
        int days = scanner1.nextInt();
        int hdiarias = 24;
        int horas = 1;
        int minutos = 60;
        int segundos = 60;

        int t1 = days  * hdiarias;
        int t2 = t1 * minutos;
        int t3 = t2 * segundos;

        System.out.println( "Hay " + t3 + " segundos");
    }
}
