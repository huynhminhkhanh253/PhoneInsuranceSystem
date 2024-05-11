package JavaCore.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        CollectionHandling.iterate(array);
    }
}
