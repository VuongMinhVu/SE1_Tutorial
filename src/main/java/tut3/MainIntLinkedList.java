package tut3;

import java.util.Iterator;

public class MainIntLinkedList {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("1st list: " + list);

        System.out.print("Even elements: ");
        Iterator<Integer> evenItor = list.evenIterator();
        while (evenItor.hasNext()) {
            System.out.print(evenItor.next() + " ");
        }
    }
}
