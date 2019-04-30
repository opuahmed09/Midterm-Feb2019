package datastructure;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String >names=new ArrayList<>();
        names.add("Opu");
        names.add("Adnan");
        names.add("samian");
        names.add("Nayem");
        names.add("RAhman bhai");
        names.add("Showrov");
        System.out.println(names);
        //for removing
        names.remove(1);


    }

}
