package Leitourgika;

import java.util.concurrent.Callable;

public class Pro extends Thread implements Callable {

    String name;
    int array[];
    int pro = 1;

    Pro(String threadName, int filledArray[]){

        array = filledArray;
        name = threadName;

        System.out.println(name + " created");
        System.out.println("------------------------------------------------------");

    }

    public void run(){

        System.out.println(name + " is running");
        System.out.println("------------------------------------------------------");

        for (int i=0;i<array.length;i++){
            pro = pro * array[i];
        }

        System.out.println("Your array's product is: "+ String.valueOf(pro));
        System.out.println("------------------------------------------------------");

    }

    @Override
    public Object call() throws Exception {
        return pro;
    }
}
