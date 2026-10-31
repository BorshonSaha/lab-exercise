package workingWithLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WorkingWithList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        long start = System.currentTimeMillis();
        addElements(list);
        long end = System.currentTimeMillis();
        System.out.println("Time needed for arrayList: " + (end - start));

        List<Integer> list2 = new LinkedList<>();
        list2.add(0);
        start = System.currentTimeMillis();
        addElements(list2);
        end = System.currentTimeMillis();
        System.out.println("Time needed for linkedList: " + (end - start));

        list = new ArrayList<>();
        list.add(0);
        start = System.currentTimeMillis();
        addElementsAtBegin(list);
        end = System.currentTimeMillis();
        System.out.println("Time needed for arrayList with addElementsAtBegin(): " + (end - start));

        list2 = new LinkedList<>();
        list2.add(0);
        start = System.currentTimeMillis();
        addElementsAtBegin(list2);
        end = System.currentTimeMillis();
        System.out.println("Time needed for linkedList with addElementsAtBegin():" + (end - start));
    }

    public static void addElements(List<Integer> list){
        Random random = new Random();
        for(int i = 0; i < 100000; i++){
            int number = random.nextInt();
            list.add(random.nextInt(list.size()), number );
        }
    }

    public static void addElementsAtBegin(List<Integer> list){
        Random random = new Random();
        for(int i = 0; i < 100000; i++){
            int number = random.nextInt();
            list.add(0, number );
        }
    }
}
