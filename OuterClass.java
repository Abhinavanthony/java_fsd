public class OuterClass {
    private int outerData = 10;

    public void outerMethod() {
        System.out.println("Outer method");
    }

    // Inner class
    public class InnerClass {
        private int innerData = 20;

        public void innerMethod() {
            System.out.println("Inner method");
        }

        public void accessOuterData() {
            System.out.println("Accessing outerData from InnerClass: " + outerData);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the OuterClass
        OuterClass outerObj = new OuterClass();

        // Create an instance of the InnerClass
        InnerClass innerObj = outerObj.new InnerClass();

        // Access the inner methods and data
        innerObj.innerMethod();
        innerObj.accessOuterData();

        // Access the outer method
        outerObj.outerMethod();
    }
}
