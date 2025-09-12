package tut3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabet {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            l1.add((int) c);
        }

        Iterator<Integer> iterator = l1.iterator();
        while (iterator.hasNext()) {
            int charCode = iterator.next();
            if (charCode % 2 != 0) {
                l2.add(charCode);
            }
        }

        System.out.println("List l1 (all character codes a-z):");
        for (int code : l1) {
            System.out.print(code + " ");
        }
        System.out.println();

        System.out.println("List l2 (only odd character codes):");
        for (int code : l2) {
            System.out.print(code + " ");
        }
    }
}
