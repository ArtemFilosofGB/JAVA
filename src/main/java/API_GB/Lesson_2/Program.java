package API_GB.Lesson_2;

class Program {
    public static void main(String[] args) {
        int iterations = 1000000;
//        Time taken with String: 58706 ms
//        Time taken with StringBuilder: 14 ms


        // Using String
        long startTimeString = System.currentTimeMillis();
        concatenateWithString(iterations);
        long endTimeString = System.currentTimeMillis();
        System.out.println("Time taken with String: " + (endTimeString - startTimeString) + " ms");

        // Using StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        concatenateWithStringBuilder(iterations);
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTimeStringBuilder - startTimeStringBuilder) + " ms");
    }

    private static void concatenateWithString(int iterations) {
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "a";
        }
    }

    private static void concatenateWithStringBuilder(int iterations) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            result.append("a");
        }
    }
}