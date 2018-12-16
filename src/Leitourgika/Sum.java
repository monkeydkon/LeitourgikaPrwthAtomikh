package Leitourgika;


import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Sum extends Thread implements Callable {

    String name;
    int array[];
    int sum = 0;
    boolean second;
    int which;


    Sum(String threadName, int filledArray[], boolean bool){

        array = filledArray;
        name = threadName;
        second = bool;

        which = ThreadLocalRandom.current().nextInt(0,2);

        System.out.println(name + " created");
        System.out.println("------------------------------------------------------");

    }

    public void run(){

        System.out.println(name + " is running");
        System.out.println("------------------------------------------------------");

        if(second == true){
            if(which == 0){
                for(int i=0; i<Math.round(array.length/2); i++){
                    array[i] = ThreadLocalRandom.current().nextInt(-100,101);
                }
            }else{
                for(int i=Math.round(array.length/2); i<array.length; i++){
                    array[i] = ThreadLocalRandom.current().nextInt(-100,101);
                }
            }
        }

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
