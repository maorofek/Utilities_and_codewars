//import java.lang.module.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {


        Person p1 = new Person("Maor", 27);
        Person p2 = new Person("Naor", 15);
        Person p3 = new Person("Elazar", 25);
        Person p4 = new Person("Eliezer", 76);
        Person p5 = new Person("Johnny", 25);
        Person p6 = new Person("Shahar", 12);
        Person p7 = new Person("saar", 32);
        Person p8 = new Person("Yarden", 19);
        Person p9 = new Person("Shlomi", 22);
        Person p10 = new Person("Shlomo", 20);
        Person p11 = Person.PersonBuilder.aPerson().name("Maor").age(28).build(); //builder used

        HashMap<Person, Integer> map = new HashMap<>();
        List<Person> humans = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));

        map.put(p1, 2);
        map.put(p2, 2);
        map.put(p3, 2);
        map.put(p4, 2);
        map.put(p5, 2);
        map.put(p6, 2);
        map.put(p7, 2);
        map.put(p8, 2);
        map.put(p9, 2);
        map.put(p10, 2);
        map.put(p11, 2);

        System.out.println("----------------------------------------------------------------------------------------------------");
        //filter by age 30+

        humans.stream().filter(x -> x.age >= 30).collect(Collectors.toList()).forEach(Person::hello); //random canSayHello
        humans.stream().filter(x -> x.age >= 30).collect(Collectors.toList()).forEach(System.out::println); //random canSayHello
        humans.stream().filter(x -> x.age >= 30).forEach(System.out::println);
        humans.forEach(person -> {
            if (person.age >= 30)
                System.out.println(person);
        });

        System.out.println("----------------------------------------------------------------------------------------------------");
        //sort by name

        humans.stream().sorted().forEach(System.out::println);


        System.out.println("----------------------------------------------------------------------------------------------------");
        //return amount of ppl age 30+
        System.out.println(humans.stream().filter(x -> x.age >= 30).count());

    }
}