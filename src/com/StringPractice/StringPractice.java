package com.StringPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StringPractice extends StringChild{

    int somevalue;
    String s1 = new String("Mani").intern();

    @Override
    public void someMethod(){
        System.out.println("some Method from base class");
    }



    public static void main(String[] args) {


        StringParent sp = new StringParent();
        sp.someMethod();

        StringParent sc = new StringChild();
        sc.someMethod();











//        StringChild.someMethod();
//        StringPractice.someMethod();

        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
//flat the stream from List<String> to String stream
        Stream<String> flatStream = namesOriginalList
                .flatMap(strList -> strList.stream());

        Optional<String> firstNameWithD = flatStream.filter(i -> i.startsWith("D")).findFirst();

        if(firstNameWithD.isPresent()){

        }


        Stream<Integer> numbers3 = Stream.of(1,2, 3);

        Optional<Integer> intOptional = numbers3.reduce((i, j) -> i*j);

                System.out.println(intOptional.toString());

//
//        System.out.println("Stream contains 4? "
//                +numbers3.anyMatch(i -> i==4));



//        flatStream.forEach(System.out::print);


//        String s1 = new String("Mani");
////        String s3 = s1;
//        String s2 = "Main";
////        String s4 = "Mani";
//        System.out.println(s1.compareTo(s2));
//        System.out.println("Using equals :" + s1.equals(s2));
//        System.out.println("Using == :" + (s1 == s2));
//        System.out.println("Using equals :" + s1.equals(s3));
//        System.out.println("Using == :" + (s4.hashCode() == s2.hashCode()));
    }

}
