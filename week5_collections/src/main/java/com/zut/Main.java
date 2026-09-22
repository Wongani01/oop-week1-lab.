package com.zut;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //== Part 2: ArrayList
      List<String> contacts = new ArrayList<>();
contacts.add("Mary- 091");
contacts.add("Jacob- 092");
contacts.add("Ben- 093");
contacts.add("Fred- 094");
System.out.println("Before deleting Fred " + contacts);
contacts.remove("Fred- 094");
System.out.println("After deleting Fred " + contacts);

System.out.println(contacts);  
//== Part 3: LinkedList
List<String>queue = new LinkedList<>();
queue.add("Ticket 1");
queue.add("Ticket 3");
System.out.println("Size: " + queue.size());
queue.add(1, "Ticket 2");
System.out.println(queue);

//Same middle- insert on the ArrayList from Part 2
contacts.add(1, "Alex-097 ");
System.out.println(contacts);

//== Part 4: HashSet  - no more duplicate numbers==

List<String> numbers = new ArrayList<>();
numbers.add("097");
numbers.add("096");
numbers.add("097"); //same number again
System.out.println(numbers); //prints all 3 numbers

//Fixed the bud where we have duplicate numbers by swapping List/ArrayList for Set/HashSet
Set<String> numbers2 = new HashSet<>();
numbers2.add("097");
numbers2.add("096");
numbers2.add("097"); //same number again
System.out.println(numbers2); //prints only 2 numbers
        
    }
}
