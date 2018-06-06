package com.cambeeler;

// Note that you are creating your own LinkedList class here, not using the built-in Java one..
//
// The rules for adding an item to the linked list are:
//  If the head of the list is null, make the head refer to the item to be added.
//  If the item to be added is less than the current item in the list, add the item before the
//      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
//      "next" refer to the current item).
//  If the item to be added is greater than the current item, move onto the next item and compare
//      again (if there is no next item then that is where the new item belongs).
//
// Care will be needed when inserting before the first item in the list (as it will not have a previous
// item).
//
// You will also need a method to remove an item from the list.
//



public class CList <T>{
    private int count = 0;
    private CamObjectItem<T> head;
    private CamObjectItem<T> tail;
    public CList (){
        // no items added to the list yet, head, tail == null still
    }

    public CList (T item){ // upon creation, the first item = both head and tail.  One item list.
        head = new CamObjectItem(null, item, null);
        tail = head;
        count++;
    }

    public T getHead(){ return (T) head.getValue();}
    public T getTail(){ return (T)tail.getValue();}
    public int size(){return count;}

    public CamObjectItem findItem(T locateItem){
        CamObjectItem object = head;
        while(object!=null){
            if(object.getValue() == locateItem){
                return object;
            }
            object=(CamObjectItem)object.getNext();
        }
        return null;
    }

    public boolean removeItem(T deadItem){
        return true;
    }

    public boolean addItem (T newItem){
        if(head==null){ // if the list is a 0 item list, then the new item is the head & tail.
            head = new CamObjectItem<>(null, newItem, null);
            tail = head;
            count++;
            return true;
        } else if(head == tail){ // obviously, head != null, so there is a list.  If the head = tail, then it is a 1 item list since no duplicates
                // compare new item to head.  if greater, tail = new, if less, head = new
            //compare
            // if > then tail
            // if < then head
            return true;
        }
//      Begin at Head, and compare with next until it is bigger than next, then insert into the array.
//  head.CompareItems(head, newItem);
        if((findItem(newItem)==null)){
//            insertItem(newItem);
            return true;
        }

        return false;
    }

//    public boolean insertItem(T newItem){
//        CamObjectItem object = head;
//        while(object.getValue()>newItem){
//
//        }

    }

