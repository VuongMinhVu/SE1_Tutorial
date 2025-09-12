package tut1;

public class Counter {
    int count;

    public Counter(){
        count =0;
    }

    public int get(){
        return count;
    }

    public void incr(){
        count++;
    }

    public static void main(String[] args){
        Counter counter = new Counter();

        for (int i = 1; i <= 100; i++) {
            counter.incr();
            System.out.println("Iteration " + i + ", Counter = " + counter.get());
        }

        System.out.println("Total iterations = " + counter.get());
    }
    
}

