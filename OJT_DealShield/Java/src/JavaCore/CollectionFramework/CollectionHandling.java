package JavaCore.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionHandling {
    public static void iterate(ArrayList<Integer> array) {
        System.out.println("below is for-each loop");
        for (int element : array) {
            System.out.println(element);
        }

        System.out.println("below is foreach method");
        array.forEach(element -> {
            System.out.println(element);
        });

        System.out.println("below is iterate method");
        Iterator<Integer> elements = array.iterator();
        while (elements.hasNext()) {

            System.out.println(elements.next());
        }

        // Why we need a Iterator;
        // Example when we need to modify when iterate
        System.out.println();
        System.out.println("***Example to show use case of iterator");

        try {
            for(int element : array){
                System.out.println(element);
                array.remove(element); // throw exception
            }
        }
        catch (Exception e){
            System.out.println("You cannot modify array size in a loop");
        }

        // => to handle above case, use ***Iterator***

        Iterator elements_list = array.iterator();
        while(elements_list.hasNext()){
            System.out.println(elements_list.next());
            elements_list.remove(); // Valid for iterator
        }


    }
}
