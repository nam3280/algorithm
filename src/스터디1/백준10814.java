package 스터디1;

import java.io.*;
import java.util.*;

public class 백준10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            Person person = new Person(Integer.parseInt(input[0]), input[1], i);
            list.add(person);
        }

        list.sort(Comparator.comparingInt((Person p) -> p.age).thenComparingInt(p -> p.index));

        for (Person person : list)
            System.out.println(person.age + " " + person.name);

    }

    static class Person{
        int age;
        String name;
        int index;

        Person(int age, String name, int index){
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }
}
