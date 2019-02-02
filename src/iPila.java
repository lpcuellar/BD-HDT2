/* package com.company;
 *
 *   @Author Luis Pedro Cuéllar - 18220 y Jaier Ramírez - 18099
 *   @Date   1/02/2019
 *   @Project    Hoja de Trabajo #2 / Algoritmos y Estructura de Base de Datos
 *
 *   Esta clase es una interfaz para un Stack.
 */

/**
 * @param <E>
 */
public interface iPila<E> {

    public void push(E item);
        //  pre:
        //  post:   item is added to th stack
        //  will be popped next if no intervening push

    public E pop ();
    //  pre:    stack si not empty
    //  post:   most recently pushed item is removed and returned

    public E peek();
    //  pre:    stack is not empty
    //  post:   top value (next to be popped) is retuned.

}


