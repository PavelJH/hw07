public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name + "...");
    }

    public String getNumber() {
        return number;
    }
    Phone phone1 = new Phone("555-1234", "iPhone 13", 0.3);
    Phone phone2 = new Phone("555-5678", "Samsung Galaxy S21", 0.4);
    Phone phone3 = new Phone("555-9101", "Google Pixel 6", 0.35);

System.out.println(phone1.getNumber());
phone1.receiveCall("Alice");

System.out.println(phone2.getNumber());
phone2.receiveCall("Bob");

System.out.println(phone3.getNumber());
phone3.receiveCall("Charlie");

}
