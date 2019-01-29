package com.company;

public class Vector implements iCalculadora {

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
