package com.zut;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

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

//Predict then run : add the same-looking Contact twice into a HashSet<Contact>
Set<Contact> uniqueContacts = new HashSet<>();
uniqueContacts.add(new Contact("Jacob", "091"));
uniqueContacts.add(new Contact("Jacob", "091")); //same contact again
System.out.println(uniqueContacts.size()); //prints both contacts, even though they look the same

// Part 5: LinkedHashSet - preserves insertion order
Set<String> names = new LinkedHashSet<>();
names.add("Shakil");
names.add("Chanda");
names.add("Ben"); 
names.add("Jacob"); 
System.out.println(names); //prints in the order they were added

// Part 6: TreeSet - sorts the elements in natural order
Set<Integer> numbers3 = new TreeSet<>();
numbers3.add(100);
numbers3.add(50);
numbers3.add(1);
numbers3.add(-10);
System.out.println(numbers3); 

// Part 7: HashMap - key-value 

Map<String, Contact> phoneBook = new HashMap<>();
phoneBook.put("097", new Contact("Jacob", "097"));
phoneBook.put("096", new Contact("Mary", "096"));
System.out.println(phoneBook); 

Contact found = phoneBook.get("096");
System.out.println("Found contact: " + found.getName());

//Part 6.3 //iterate over all entries
for(Map.Entry<String, Contact> entry : phoneBook.entrySet()) {
   System.out.println(entry.getKey() + " ->" + entry.getValue().getName());
}
ContactAPI api = new ContactAPI();
api.fetchContact(1); //fetches contact with id 1 from the API
        
    }
}
