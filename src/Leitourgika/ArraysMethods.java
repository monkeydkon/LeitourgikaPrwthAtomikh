package Leitourgika;

import java.util.concurrent.ThreadLocalRandom;

public class ArraysMethods {

    int N;
    int array[];

    public ArraysMethods(int input){
        N = input;
        array = new int[N];
        System.out.println("you just made an array of "+String.valueOf(N)+" values");
    }

    public int[] fillArray(int input){


        for(int i=0; i<array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(-100,101);
        }

        return  array;
    }


}
