package com.zut;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

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
        
    }
}
