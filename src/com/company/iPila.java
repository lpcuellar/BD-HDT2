package com.company;

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



