public class Person {
    private String fullName;
    private int age;

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving.");
    }

    public void talk() {
        System.out.println(fullName + " is talking.");
    }
    Person person1 = new Person();
    Person person2 = new Person("John Smith", 30);

}
