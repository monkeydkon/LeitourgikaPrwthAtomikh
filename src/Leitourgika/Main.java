package Leitourgika;

import java.util.Scanner;

public class Main {

    public static void main(String [] args)
    {

        System.out.println("type the integer size of the array and press enter");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        ArraysMethods arraysMethods = new ArraysMethods(num);
        int filledArray[] = arraysMethods.fillArray(num);
        
//        for (int i=0;i<filledArray.length;i++){
//            System.out.println(filledArray[i]);
//        }

    }
}
