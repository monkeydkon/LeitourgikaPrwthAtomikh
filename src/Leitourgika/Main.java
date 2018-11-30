package Leitourgika;

import java.util.Scanner;

public class Main {


    public static void main(String [] args) throws Exception {

        System.out.println("type the integer size of the array and press enter");
        System.out.println("------------------------------------------------------");


        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        ArraysMethods arraysMethods = new ArraysMethods(num);
        int filledArray[] = arraysMethods.fillArray(num);

//        for (int i=0;i<filledArray.length;i++){
//            System.out.println(filledArray[i]);
//        }

        Sum thread1 = new Sum("first thread",filledArray);
        Pro thread2 = new Pro("second thread", filledArray);
        Choose thread3 = new Choose("third thread");

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();

        int sum = (int)thread1.call();
        int pro = (int)thread2.call();
        int random = (int)thread3.call();

        Order thread4 = new Order(sum, pro, random, "fourth thread");
        thread4.start();
        thread4.join();

    }
}
