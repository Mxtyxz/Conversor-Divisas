package com.alura.conversor_divisas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        while (true) {
            System.out.println("********************************************");
            System.out.println("Sea bienvenido/a al Conversor de Divisas");
            System.out.println("\n" + "1) Dolár =>> Peso argentino");
            System.out.println("\n" + "2) Peso argentino =>> Dolár");
            System.out.println("\n" + "3) Dolár =>> Real brasileño");
            System.out.println("\n" + "4) Real brasileño =>> Dolár");
            System.out.println("\n" + "5) Dolár =>> Peso colombiano");
            System.out.println("\n" + "6) Peso colombiano =>> Dolár");
            System.out.println("\n" + "7) salir");
            System.out.println("\nElija una opción válida:");
            System.out.println("********************************************");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            String divisa1;
            String divisa2;

            if (opcion == 7) {
                System.out.println("¡Gracias por usar el conversor de divisas!");
                break;
            }

            switch (opcion) {
                case 1:
                    divisa1 = "USD";
                    divisa2 = "ARS";
                    break;
                case 2:
                    divisa1 = "ARS";
                    divisa2 = "USD";
                    break;
                case 3:
                    divisa1 = "USD";
                    divisa2 = "BRL";
                    break;
                case 4:
                    divisa1 = "BRL";
                    divisa2 = "USD";
                    break;
                case 5:
                    divisa1 = "USD";
                    divisa2 = "COP";
                    break;
                case 6:
                    divisa1 = "COP";
                    divisa2 = "USD";
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
                    continue;
            }

            ConsultaDivisa consulta = new ConsultaDivisa();
            Divisas divisas = consulta.buscaDivisa(divisa1);

            if (divisas == null || divisas.getConversionRates() == null) {
                System.out.println("Error al obtener las tasas de conversión. Por favor intente más tarde.");
                continue;
            }

            Double conversionRate = divisas.getConversionRates().get(divisa2);
            if (conversionRate == null) {
                System.out.println("Error: No se encontró una tasa de conversión para " + divisa2);
                continue;
            }

            System.out.println("Ingrese el valor que desea convertir:");
            double valor = scanner.nextDouble();
            double valorConvertido = valor * conversionRate;

            System.out.println("El valor de " + valor + " [" + divisa1 + "] corresponde al valor final de =>>> " + valorConvertido + " [" + divisa2 + "]");
        }
    }
}
