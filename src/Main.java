import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
      //1.Convert a List<String> to uppercase
        List<String> names= Arrays.asList("rohan","mohan","rohit","sunita");
        names.stream().map((s)->s.toUpperCase()).forEach(r->System.out.println(r));

        //2.From a list of integers, filter even numbers and collect into a list.
        List<Integer> num=Arrays.asList(1,7,3,6,12,15,18,22);
      List<Integer> even=  num.stream().filter((n)->n%2==0).collect(Collectors.toList());
      System.out.println(even);



      //3.Count how many strings have length > 5
        List<String> fruits=Arrays.asList("apple","orange","grapes","mango","pineapple","litchi");
     Long counter= fruits.stream().filter((s)->s.length()>5).count();
     System.out.println(counter);



     //4a.Sort a list of integers in ascending:
        List<Integer> num=Arrays.asList(1,4,2,8,9,5,7);
        num.stream().sorted().collect(Collectors.toList()).forEach((n)->System.out.println(n));



        //4b.Sort a list of integers in descending:
        List<Integer> num=Arrays.asList(1,4,2,8,9,5,7);
        num.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));



       // 5.Find the first element starting with "S" from a list of strings.{p.t.r findFirst() }
       List<String> names=Arrays.asList("rohan","mohan","ronit","sanorita");
      String firstSName= names.stream().filter(s->s.startsWith("s")).findFirst()
              .orElse("No names present with s");
      System.out.println(firstSName);



        //6a.Find the sum of all even numbers in a list.
        List<Integer> num=Arrays.asList(1,4,3,5,6,8,9);
     int sum= num.stream().filter(n->n%2==0).mapToInt(n->n).sum();
     System.out.println("sum:"+sum);




     //6b. Find the sum of all odd numbers in a list.
        List<Integer> num=Arrays.asList(1,4,2,6,8,3,5,7);
       int sum= num.stream().filter((n)->n%2!=0).mapToInt((a)->a).sum();
       System.out.println("Sum:"+sum);



        //7.Remove duplicate elements from a list.
        List<String> element=Arrays.asList("pen","pencil","eraser","pen");
        element.stream().collect(Collectors.toSet()).forEach(s->System.out.println(s));




        //8a.Find the maximum number from a list using streams.
        List<Integer> num=Arrays.asList(1,4,6,8,9,12,0,11);
       int largest= num.stream().sorted(Comparator.reverseOrder()).findFirst()
                       .orElseThrow(()->new RuntimeException("issue in operation"));

       System.out.println(largest);




       //8b.Find the min number from a list using streams.
        List<Integer> num=Arrays.asList(1,4,6,8,9,12,11);
        int min=num.stream().sorted().findFirst()
                .orElseThrow(()->new RuntimeException("Issue in operation"));

        System.out.println("Minimum:"+min);


        //9.Find the second highest number from a list.
        List<Integer> num=Arrays.asList(1,4,6,8,9,12);
       List<Integer>  numList=  num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       System.out.println(numList.get(1));





        //10a.From a list of strings, find the longest string.

        List<String> names=Arrays.asList("Arpita","Raghavan","Mukesh","Rakesh");
      Optional<String> largest= names.stream().max((a, b)->a.length()-b.length());
      System.out.println(largest.get());




        //10b.From a list of strings, find the smallest string.

        List<String> names=Arrays.asList("Arpita","Raghavan","Mukesh","Rakesh");
       Optional<String> smallest= names.stream().min((a,b)->a.length()-b.length());
       System.out.println(smallest.get());




        //11.Safely handle null values using Optional.
        // It will not give NPE , else it will Wrap Optional of empty
        String name=null;
       Optional<String> optional= Optional.ofNullable(name);
       System.out.println(optional);

*/
        //12.Partition numbers into even and odd.

        // 1st way :partitioningBy
        List<Integer> num=Arrays.asList(1,4,3,6,5,8,9);
        Map<Boolean,List<Integer>> numMap=num.stream()
                .collect(Collectors
                        .partitioningBy((n)->n%2==0)
                );

        System.out.print( numMap);



    }

    }
