package com.cambeeler;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog Pap = new Dog("Mistletoe");
        Pap.eat();
        Pap.breathe();

        Parrot Pollie = new Parrot("Pollie");
        Pollie.eat();
        Pollie.breathe();
        Pollie.fly();

        Penguin Flute = new Penguin("Flute");
        Flute.eat();
        Flute.breathe();
        Flute.fly();
        System.out.println(Flute.getClass1() + " is the Class type, with the Object Name being " + Flute.getName());

/*                               Abstract Challenge 1                                                   */
        // Hint: to avoid typing loads of "addItem" lines, split a string into an array and create your list in
        // a loop as in the example below.
        //
        // Create a string data array to avoid typing loads of addItem instructions:

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
//        String stringData = "Kim.Cameron.Shiloh.Analiese.Wyatt";
//        String[] data = stringData.split("\\.");

        CamObjectItem<String> test;
        int i= 0;
        for (String s : data){
            System.out.println("Name is " + s);
            i++;
            if(i==1){
                test = new CamObjectItem<String>(null, s, null);

        }

    }
}


    // Optional: create a class to use your concrete class to implement a Binary Search Tree:
    // When adding items to a Binary Search Tree, if the item to be added is less than the current item
    // then move to the left, if it is greater than the current item then move to the right.
    //
    // The new item is added when an attempt to move in the required direction would involve following a
    // null reference.
    // Once again, duplicates are not allowed.
    //

