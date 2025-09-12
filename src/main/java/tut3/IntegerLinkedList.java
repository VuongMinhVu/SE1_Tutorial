package tut3;

import java.util.Iterator;
import java.util.LinkedList;

public class IntegerLinkedList extends LinkedList<Integer> {
    public Iterator<Integer> evenIterator() {
        return new EvenIterator();
    }

    private class EvenIterator implements Iterator<Integer> {
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            while (currentIndex < size() && (get(currentIndex) % 2 != 0 || get(currentIndex) == 2)) {
                currentIndex++;
            }
            return currentIndex < size();
        }
        @Override
        public Integer next() {
            int value = get(currentIndex);
            currentIndex++;
            return value;
        }
    }
}
