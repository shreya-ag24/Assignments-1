package day4;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder logMessage = new StringBuilder();
        long timestamp  = System.currentTimeMillis();

        logMessage.append("[")
                .append(timestamp)
                .append("]");
    }

}
