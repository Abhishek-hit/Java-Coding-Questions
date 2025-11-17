package JavaR;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8 {
    public static void main(String[] args) {
//        Runnable runnabe=()-> System.out.println ("hellp" );
//        runnabe.run ();

        List<Integer> list= Arrays.asList (10,15,20,6,9,11);
        // filter even numbers and collect to a new list
        List<Integer> evenList = list.stream()
                .filter(n -> n % 2 == 0).map (name->name*2)
                .collect(Collectors.toList());

        System.out.println(evenList);

    }
}
