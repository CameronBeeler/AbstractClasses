package com.cambeeler;

// Create a concrete class from your abstract list item class and use this in a LinkedList
// class to implement a linked list that will add items in order (so that they are sorted
// alphabetically). Duplicate values are not added.

public class CamObjectItem <T> extends LLCam{
// The actual implementation of the Data object that will be utilized in a List Object

    public CamObjectItem(CamObjectItem<T> previous, T value, CamObjectItem<T> next) {
        super(previous, value, next);
    }

}
