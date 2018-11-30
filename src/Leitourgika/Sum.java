package Leitourgika;


import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class Sum extends Thread implements Callable {

    String name;
    int array[];
    int sum = 0;


    Sum(String threadName, int filledArray[]){

        array = filledArray;
        name = threadName;

        System.out.println(name + " created");
        System.out.println("------------------------------------------------------");

    }

    public void run(){

        System.out.println(name + " is running");
        System.out.println("------------------------------------------------------");

        for (int i=0;i<array.length;i++){
            sum = sum + array[i];
        }

        System.out.println("Your array's sum is: "+ String.valueOf(sum));
        System.out.println("------------------------------------------------------");
    }


    @Override
    public Object call() throws Exception {
        return sum;
    }
}
