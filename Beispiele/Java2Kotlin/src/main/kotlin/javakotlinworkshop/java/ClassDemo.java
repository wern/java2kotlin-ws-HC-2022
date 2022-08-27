package javakotlinworkshop.java;

public class ClassDemo {

    public static void main(String[] args) {
        Person person = new Person("John", 50);
        person.setName("Max");
        person.setAge(42);
        print(person);
    }

    private static void print(Person person) {
        System.out.println(String.format("%s, %d",
                person.getName(),
                person.getAge()));
    }
}
