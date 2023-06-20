public class StringConversion {
    public static void main(String[] args) {
        // Create a String
        String str = "Hello, World!";

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(" Goodbye!");
        System.out.println("StringBuffer: " + stringBuffer);

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(" Have a nice day!");
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
