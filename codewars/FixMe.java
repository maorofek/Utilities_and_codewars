public class FixMe {
    public class Dinglemouse {
        String name;
        int age;
        char sex;

        public Dinglemouse() {
        }

        public Dinglemouse setAge(int age) {
            this.age = age;
            return this;
        }

        public Dinglemouse setSex(char sex) {
            this.sex = sex;
            return this;
        }

        public Dinglemouse setName(String name) {
            this.name = name;
            return this;
        }

        public String hello() {
            StringBuilder sb = new StringBuilder();

            return String.format("Hello. My name is %s. I am %d. I am %s.", name, age, sex == 'M' ? "male" : "female");
        }
    }
}