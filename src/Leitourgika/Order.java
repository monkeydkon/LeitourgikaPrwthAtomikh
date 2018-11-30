package Leitourgika;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Order extends Thread {

    int sum, pro, random;
    String name;
    Map<String, Integer> unsorted = new HashMap<>();

    Order(int sum, int pro, int random, String threadName){

        this.sum = sum;
        this.pro = pro;
        this.random = random;
        name = threadName;

        System.out.println(threadName + " created");
        System.out.println("------------------------------------------------------");

    }

    public void run(){

        System.out.println(name + " is running");
        System.out.println("------------------------------------------------------");

        unsorted.put("sum",sum);
        unsorted.put("pro", pro);
        unsorted.put("random", random);

        final Map<String, Integer> sorted = unsorted.entrySet()

                .stream()

                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))

                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        
        System.out.println(sorted);

    }

}
