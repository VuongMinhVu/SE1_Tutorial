package tut3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNums {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        Random rand = new Random();

        for(int i=0;i<10;i++){
            int numRand = rand.nextInt(100)+1;
            arr.add(numRand);
        }

        System.out.println("Random 10 number: ");
        for(int n : arr){
            System.out.print(n+ " ");
        }
    }
}
