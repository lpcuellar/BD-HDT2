/* package com.company;
 *
 *   @Author Luis Pedro Cuéllar - 18220 y Jaier Ramírez - 18099
 *   @Date   1/02/2019
 *   @Project    Hoja de Trabajo #2 / Algoritmos y Estructura de Base de Datos
 *
 *   Esta clase Stack implementa la interfaz iPila y define todos los métodos
 *   de la interfaz. Esta clase son métodos para hacer funcionar el Stack de forma adecuada.
 */

public class Stack<String> implements iPila<String> {

    private Vector<String> = new Vecto<>();

    private Pila() {
        this.data = new Vector<>();
    }

    public boolean empty() {
        return (data.size() == 0);
    }

    public int size() {
        return data.size();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        return data.remove(0);
    }

    public String peek() {
        return data.get(0);
    }

    public java.lang.String. toString(){
        java.lang.String resultado = " ";
        for (String i: data) {
            resultado = resultado + i;
        }

        return resultado;
    }
}

