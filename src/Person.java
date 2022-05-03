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


    public Person build() {
        Person person = new Person(null, 0);
        person.age = this.age;
        person.canSayHello = this.canSayHello;
        person.name = this.name;
        return person;
    }

    public static final class PersonBuilder {
        String name;
        int age;
        boolean canSayHello;

        private PersonBuilder() {
        }

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder canSayHello(boolean canSayHello) {
            this.canSayHello = canSayHello;
            return this;
        }

        public Person build() {
            Person person = new Person(null, 0);
            person.age = this.age;
            person.canSayHello = this.canSayHello;
            person.name = this.name;
            return person;
        }
    }
}