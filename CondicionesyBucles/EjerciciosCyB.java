package Sololearn.CondicionesyBucles;

import java.util.Scanner;

public class EjerciciosCyB {
    public static void main(String[] args) {

        /*
        Tienes $12,000 para comprar un auto.
        Se le proporciona un programa que toma el precio del automóvil como entrada.
        Tarea
        Salida "sí" si el precio es inferior o igual a 12.000.
        Entrada de muestra
        11000
        Salida de muestra
        sí
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el monto");
        int price = scanner.nextInt();

        if(price <= 12000){
            System.out.println("yes");
        }

        /*
        El gerente de ventas decidió dar una tarjeta de regalo a los clientes cuyas compras sumen más de 15000. Además, los clientes cuyas
        compras totales sean superiores a 30000 recibirán una segunda tarjeta de regalo.
        Se le proporciona un programa, que toma el monto de la compra como entrada e imprime "Tarjeta de regalo" si es superior a 15000.
        Tarea
        Complete el código para imprimir "Tarjeta de regalo" nuevamente si la compra es superior a 30000.
        Entrada de muestra
        36000
        Salida de muestra
        Tarjeta de regalo
        Tarjeta de regalo
         */

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el monto de compras");
        int purchases = read.nextInt();

        if(purchases > 15000){
            System.out.println("Gift card");
        }if(purchases > 30000){
            System.out.println("Gift card");

        }

        /*
        Eres un tour manager y necesitas un programa que identifique países pequeños.
        Un país se considera pequeño si su población es inferior a 10000 y su superficie es inferior a 10000 hectáreas.
        El programa dado toma población y área como entrada.
        Tarea
        Complete el programa para generar "pequeño país" si se cumplen ambas condiciones. No emita nada de lo contrario.
        Entrada de muestra
        9955
        7522
        Salida de muestra
        pais pequeño.
         */

        Scanner read1 = new Scanner(System.in);
        System.out.println("Introducir cantidad de poblacion");
        int population = read.nextInt();
        int area = read1.nextInt();
        if(population <= 10000 && area <= 10000)
            System.out.println("small country");

        /*
        Tu robot puede reconocer tus emociones marcadas con el número que representa cada una de ellas:
        1 - ¡Eres feliz!
        2 - ¡Estás triste!
        3 - ¡Estás enojado!
        4 - ¡Estás sorprendido!
        Escriba un programa que tome el número de emoción como entrada y emita el mensaje correspondiente en el formato dado.
        Si la entrada es una emoción que el programa no conoce, debe generar: "Emoción desconocida".
        Entrada de muestra
        1
        Salida de muestra
        ¡Usted es feliz!
         */

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introducir numero");
        int emotion = scanner1.nextInt();

        switch(emotion){
            case 1 :
                System.out.println("You are happy!");
                break;
            case 2:
                System.out.println("You are sad!");
                break;
            case 3 :
                System.out.println("You are angry!");
                break;
            case 4 :
                System.out.println("You are surprised!");
                break;

            default:
                System.out.println("Unknown emotion.");

        }

        /*
        Te dan un código que toma como entrada el número de estudiantes que ingresan a la universidad. ¡Saludémoslos!
        Tarea
        Complete el programa para mostrar "Bienvenido" para cada estudiante.
        Entrada de muestra
        2
        Salida de muestra
        Bienvenidos
        Bienvenidos
         */

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Numero de estudiantes");
        int n = scanner2.nextInt();

        for(int c = 1; c<=n; c++){
            System.out.println("Welcome");
        }

        /*
        Estás creando un sistema de seguridad bancaria. El usuario debe insertar la contraseña correcta para poder acceder a los pagos.
        La contraseña es 8819.
        Tarea
        Escribir un programa que continuamente tomará una contraseña como entrada y salida Escribir contraseña, hasta que el cliente inserte la contraseña correcta.
        Entrada de muestra
        3332
        8819
        Salida de muestra
        escribir contraseña
        escribir contraseña
         */

        Scanner read3 = new Scanner(System.in);
        System.out.println("Introducir contraseña");
        int password;

        do{
            System.out.println("Write password");
            password=read3.nextInt();

        }while (password !=8819);

        /*
        Tomas un préstamo de un amigo y necesitas calcular cuánto le deberás después de 3 meses.
        Le devolverá el 10% del monto restante del préstamo cada mes.
        Cree un programa que tome el monto del préstamo como entrada, calcule y genere el monto restante después de 3 meses.
        Entrada de muestra:
        20000
        Salida de muestra:
        14580
        Este es el calendario de pagos mensuales:
        Mes 1
        Pago: 10% de 20000 = 2000
        Cantidad restante: 18000
        Mes 2
        Pago: 10% de 18000 = 1800
        Cantidad restante: 16200
        Mes 3:
        Pago: 10% de 16200 = 1620
        Cantidad restante: 14580
         */


        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Introducir prestamo");
        int amount = scanner4.nextInt();
        int m = 3;
        for (int c = 0; c < m; c++)
            amount = amount * 90 / 100;
        System.out.println(amount);
    }
}
