package com.cambeeler;

//  The head is the LeftMost item 'T'.  The previous will be 'null'.

public abstract class LLCam<T>{
// This is an analog of the c STRUCT including references for a bi-directional LinkedList
// For this challenge, create an abstract class to define items that can be stored in a list.
// The class should contain 2 references to items which will represent the next and previous
// items (in the case of a linked list).
// I.e., if you call your abstract class ListItem, then it would have 2 member variables of
// type ListItem that will hold references to the next/right and previous/left ListItems.
    private LLCam previous; //  Previous item of the list
    private LLCam next; //  next item in the list
    private T value;

// The abstract class will also need to hold a value - try to be as flexible as possible
// when defining the type of this value.

    public LLCam(LLCam previous, T value, LLCam next) {
//  Will need to identify if there is an existing previous or next or head value?
        this.value = value;
        this.previous = previous;
        this.next = next;
    }


// The class will also need methods to move to the next item and back to the previous item,
// and methods to set the next and previous items.

    public LLCam LLMoveNext(){ // traverse to the right
        return previous;
    }

    public LLCam LLMovePrevious(){ // traverse to the left
        return next;
    }
    public T getValue(){return value;}
    public LLCam getPrevious(){return previous;}
    public LLCam getNext(){return next;}

    // You should also specify a compareTo() method that takes a parameter of the same type as the
    // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
    // the parameter and less than zero if it sorts less than the parameter.

    public String getName(){

        return "Value " + value;
    }
}
