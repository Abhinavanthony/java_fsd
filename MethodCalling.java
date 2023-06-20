public class MethodCalling {
    public static void main(String[] args) {
        // Create an instance of the MyClass
        MyClass obj = new MyClass();

        // Call the method with no parameters
        obj.methodWithNoParameters();

        // Call the method with parameters
        int sum = obj.methodWithParameters(5, 10);
        System.out.println("Sum: " + sum);

        // Call the method with a return value
        int result = obj.methodWithReturnValue();
        System.out.println("Result: " + result);

        // Call the static method
        MyClass.staticMethod();

        // Call the method with variable arguments
        obj.methodWithVarArgs("Hello", "World");
        obj.methodWithVarArgs("Java", "is", "awesome");

        // Call the method with method overloading
        obj.overloadedMethod(5);
        obj.overloadedMethod(2, 3);
    }
}

class MyClass {
    public void methodWithNoParameters() {
        System.out.println("Method with no parameters");
    }

    public int methodWithParameters(int a, int b) {
        return a + b;
    }

    public int methodWithReturnValue() {
        return 42;
    }

    public static void staticMethod() {
        System.out.println("Static method");
    }

    public void methodWithVarArgs(String... args) {
        System.out.print("Variable Arguments: ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    public void overloadedMethod(int a) {
        System.out.println("Overloaded method with one parameter: " + a);
    }

    public void overloadedMethod(int a, int b) {
        System.out.println("Overloaded method with two parameters: " + a + ", " + b);
    }
}
