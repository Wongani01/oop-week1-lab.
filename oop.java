
class person {
     String name;
    int age;

    person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printDetails () {
        System.out.println (name + " is " + age + " years old");
    }
}
public class oop {
    public static void main(String[] args) {
        person[] people = {
            new person("Ben", 10),
            new person("Mary", 6),
            new person("Leo", 97)

        };

        for (person p : people) {
            p.printDetails();
        }
    }
}
    
