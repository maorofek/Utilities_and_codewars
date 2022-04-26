import java.util.Random;

public class Person implements Comparable<Person> {
    String name;
    int age;
    boolean canSayHello;

    public Person(String _name, int _age) {
        name = _name;
        age = _age;
        canSayHello = new Random().nextBoolean();
    }

    public void hello() {
        if (canSayHello) {
            System.out.println(name);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", canSayHello=" + canSayHello +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.name);
    }
}
