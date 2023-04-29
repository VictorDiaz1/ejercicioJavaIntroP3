package ejerciciosJavaIntroP3;

import java.util.Scanner;

public class Ej3P3FuncionConvertirMoneda {
//Crea una aplicación que a través de una función nos convierta una cantidad
//de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
//yenes o libras. La función tendrá como parámetros, la cantidad de euros y
//la moneda a convertir que será una cadena, este no devolverá ningún valor
//y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cantidad en euros:");
        int euro = sc.nextInt();
        System.out.println("Ingrese a que moneda desea convertir:");
        System.out.println("1:libra\n" + "2:dolar\n" + "3:yen");
        int opcion = sc.nextInt();
        String moneda ="";

        switch (opcion) {
            case 1:
                String libra = String.valueOf("libra");
                moneda = libra;
                break;
            case 2:
                String dolar = String.valueOf("dolar");
                moneda = dolar;
                break;
            case 3:
                String yen = String.valueOf("yen");
                moneda = yen;
                break;
            default:
                System.out.println("Ingreso un valor incorrecto.FIN");
        }
        conversion(euro, moneda);
    }

    public static void conversion(int euro, String moneda) {

        if (moneda.equals("libra")) {
            System.out.println("La cantidad de euros equivale a: " + euro * 0.86 + " libras.");
        }
        if (moneda.equals("dolar")) {
            System.out.println("La cantidad de euros equivale a: " + euro * 1.28611 + " dolares.");
        }
        if (moneda.equals("yen")) {
            System.out.println("La cantidad de euros equivale a: " + euro * 129.852 + " yenes.");
        }
    }
}
