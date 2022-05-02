package Reflection;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        this.name = "Bobi";
        this.age = 2;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setName() {
        this.name = "set Privately name";
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }
}
