/* package com.company;
 *
 *   @Author Luis Pedro Cuéllar - 18220 y Jaier Ramírez - 18099
 *   @Date   1/02/2019
 *   @Project    Hoja de Trabajo #2 / Algoritmos y Estructura de Base de Datos
 *
 *   Esta clase sirve como el main para que el programa corra. Se encarga de leer un archivo de texto
 *   y separar los números y los operadores matemáticos en un stack, para luego ser evaluados.
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        iCalculadora miCalculadora = new Calculadora();
        iPila<String> stack = new Stack<>();

        do {
            System.out.println(" - MENU - ");
            System.out.println(" 1. Iniciar la calculadora ");
            System.out.println(" 2. Salir del programa");
            int opcion = scan.nextInt();

            if (opcion != 2) {
                System.out.println(" Ingrese el archivo .txt que desea leer. ");
                String textFile = in.nextLine();

                try {
                    Stream<String> line = Files.line(Paths.get(textFile), StandarCharsets.UTF_8);
                    line.forEach(line -> {
                        String[] characters = line.split(" ");

                        for (String i : parts) {
                            System.out.println(i.toString());
                            if (i.equals("+")) {
                                double a = double.paresedouble(stack.pop());
                                double b = double.paresedouble(stack.pop());
                                double result = double miCalculadora.sumar(a, b);
                                stack.push(result.toString());
                            }

                            else if (i.equals("-")) {
                                double a = double.paresedouble(stack.pop());
                                double b = double.paresedouble(stack.pop());
                                double result = double miCalculadora.restar(a, b);
                                stack.push(result.toString()),
                            }

                            else if (i.equals("*")) {
                                double a = double.paresedouble(stack.pop());
                                double b = double.paresedouble(stack.pop());
                                double result = double miCalculadora.multiplicar(a, b);
                                stack.push(result.toString());
                            }

                            else if (i.equals("/")) {
                                double a = double.paresedouble(stack.pop());
                                double b = double.paresedouble(stack.pop());
                                double result = double miCalculadora.dividir(a, b);
                                stack.push(result.toString());
                            }
                        }
                    });
                }
                catch (IOExeption exeption) {
                    System.out.println("Por favor ingrese un archivo .txt válido!");
                }

            }

            else {
             Syste.out.println(" Gracias por usar la calculadora <3 ");
            }
        }
    }
}
