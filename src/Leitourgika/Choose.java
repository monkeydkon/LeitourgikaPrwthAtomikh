package Leitourgika;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class Choose extends Thread implements Callable {

    String name;
    int random;

    Choose(String threadName){

        name = threadName;

        System.out.println(name + " created");
        System.out.println("------------------------------------------------------");

    }

    public void run(){

        System.out.println(name + " is running");
        System.out.println("------------------------------------------------------");

        random = ThreadLocalRandom.current().nextInt(-1000,1001);

        System.out.println("the random number is : " + String.valueOf(random));
        System.out.println("------------------------------------------------------");

    }

    @Override
    public Object call() throws Exception {
        return random;
    }
}
