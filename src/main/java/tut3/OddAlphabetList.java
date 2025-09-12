package tut3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabetList {
    public static void main(String[] args) {
        List<Character> oddAlphabetList = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            if ((int) c % 2 != 0) {
                oddAlphabetList.add(c);
            }
        }

        Iterator<Character> iterator = oddAlphabetList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
