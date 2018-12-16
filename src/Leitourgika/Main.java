package Leitourgika;

import java.util.Scanner;

public class Main {


    public static void main(String [] args) throws Exception {

        int which;
        boolean second = false;

        System.out.println("type the integer size of the array and press enter");
        System.out.println("------------------------------------------------------");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("gia erwthma 1 pathste 1, gia erwthma 2 pathste 2");
        System.out.println("------------------------------------------------------");

        in = new Scanner(System.in);
        which = in.nextInt();

        if(which==1){
            second = false;
            System.out.println("epileksate to prwto erwthma");

        }else if(which==2){
            second = true;
            System.out.println("epileksate to deutero erwthma");
        }else {
            System.out.println("epileksate to deutero erwthma");
        }

        ArraysMethods arraysMethods = new ArraysMethods(num);
        int filledArray[] = arraysMethods.fillArray(num);

//        for (int i=0;i<filledArray.length;i++){
//            System.out.println(filledArray[i]);
//        }

        Sum thread1 = new Sum("first thread",filledArray,second);
        Pro thread2 = new Pro("second thread", filledArray,second);
        Choose thread3 = new Choose("third thread");

        thread1.start();

        if (second){
            thread1.sleep(5000);
        }

        thread2.start();

        if (second){
            thread2.sleep(5000);
        }

        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        int sum = (int)thread1.call();
        int pro = (int)thread2.call();
        int random = (int)thread3.call();

        Order thread4 = new Order(sum, pro, random, "fourth thread");
        thread4.start();





    }
}
