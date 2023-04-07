package ejerciciosJavaIntroP3;

import java.util.Scanner;

public class Ejercicio1P3 {
//    Crea una aplicación que le pida dos números al usuario y este pueda
//    elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
//    una función para cada operación matemática y deben devolver sus resultados
//    para imprimirlos en el main. 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Ingrese la operacion a realizar:");
        System.out.println("1:sumar\n" + "2:restar\n" + "3:multiplicar\n"
                + "4:dividir\n");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                int suma = sumar(num1, num2);
                System.out.println("La suma de ambos es: " + suma);
                break;
            case 2:
                int resta = restar(num1, num2);
                System.out.println("La resta de ambos es: " + resta);
                break;
            case 3:
                int multiplicacion = multiplicar(num1, num2);
                System.out.println("La multiplicacion de ambos es: "
                        + multiplicacion);
                break;
            case 4:
                int division = dividir(num1, num2);
                System.out.println("La division de ambos es: " + division);
                break;
            default:
                System.out.println("Eligio una opcion incorrecta. FIN");
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static int dividir(int num1, int num2) {
        int division;
        division = num1 / num2;
        return division;
    }
}
