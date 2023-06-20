public class Constructor {
    public static void main(String[] args) {
        // Create instances using different constructors
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass("Hello");
        MyClass obj3 = new MyClass(10, "World");

        // Call instance methods on the objects
        obj1.print();
        obj2.print();
        obj3.print();
    }
}

class MyClass {
    private String message;
    private int number;

    // Default constructor
    public MyClass() {
        message = "Default Message";
        number = 0;
    }

    // Constructor with one parameter
    public MyClass(String message) {
        this.message = message;
        number = 0;
    }

    // Constructor with two parameters
    public MyClass(int number, String message) {
        this.message = message;
        this.number = number;
    }

    public void print() {
        System.out.println("Message: " + message + ", Number: " + number);
    }
}
