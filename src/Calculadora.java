/**
 *
 */
/* package com.company;
*
*   @Author Luis Pedro Cuéllar - 18220 y Jaier Ramírez - 18099
*   @Date   1/02/2019
*   @Project    Hoja de Trabajo #2 / Algoritmos y Estructura de Base de Datos
*
*   Esta clase Calculadora implementa la interfaz iCalculadora y define todos los métodos
*   de la interfaz. Esta clase son operaciones aritméticas básicas.
*/
public class Calculadora implements iCalculadora {

    double a;
    double b;
    double resultado;

    public double sumar(double a, double b) {
        this.a = a;
        this.b = b;
        this.resultado = a + b;
        return this.resultado;
    }
    public double resatr(double a, double b) {
        this.a = a;
        this.b = b;
        this.resultado = a - b;
        return this.resultado;
    }

    public double multiplicar(double a, double b){
        this.a = a;
        this.b = b;
        this.resultado = a * b;
        return this.resultado;
    }

    public double dividir(double a, double b) {
        this.a = a;
        this.b = b;
        this.resultado = a / b;
        return  this.resultado;
    }
}
