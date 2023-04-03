package ejerciciosjavaeggp3;

import java.util.Scanner;

public class Ejercicio2P3 {
//    Diseñe una función que pida el nombre y la edad de N personas e
//    imprima los datos de las personas ingresadas por teclado e indique si
//    son mayores o menores de edad. Después de cada persona, el programa
//    debe preguntarle al usuario si quiere seguir mostrando personas y frenar
//    cuando el usuario ingrese la palabra “No”.

    public static void main(String[] args) {

        String nombre = "";
        int edad = 0;
        datos(nombre, edad);
    }

    public static void datos(String nombre, int edad) {

        Scanner sc = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);

        String respuesta;
        do {
            System.out.println("Ingrese su nombre: ");
            nombre = sc.nextLine();

            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
            sc.nextLine();

            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            System.out.println("Desea continuar?");
            respuesta = sc.nextLine();
            //sc.nextLine();
        } while (!respuesta.equalsIgnoreCase("no"));

    }

}
