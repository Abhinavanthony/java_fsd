public class AccessModifiers {
    public static void main(String[] args) {
        // Create an instance of the MyClass
        MyClass obj = new MyClass();

        // Accessing public member variables and methods
        obj.publicVariable = 10;
        obj.publicMethod();

        // Accessing protected member variables and methods
        obj.protectedVariable = 20;
        obj.protectedMethod();

        // Accessing default (package-private) member variables and methods
        obj.defaultVariable = 30;
        obj.defaultMethod();

        // Accessing private member variables and methods
        // This will result in a compile-time error
        // obj.privateVariable = 40;
        // obj.privateMethod();
    }
}

class MyClass {
    public int publicVariable;
    protected int protectedVariable;
    int defaultVariable;
    private int privateVariable;

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }
}
