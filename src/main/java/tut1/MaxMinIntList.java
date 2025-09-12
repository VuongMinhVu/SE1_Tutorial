package tut1;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinIntList extends ArrayList<Integer> {
    public Integer min() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty, cannot get min.");
        }
        return Collections.min(this);
    }

    public Integer max() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty, cannot get max.");
        }
        return Collections.max(this);
    }
    public static void main(String[] args) {
        MaxMinIntList list = new MaxMinIntList();
        
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(1);
        list.add(15);

        System.out.println("List: " + list);

        System.out.println("Min = " + list.min());
        System.out.println("Max = " + list.max());
    }
}
