//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
//the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
//one is better.
package stringoperations;

public class PerformanceTest {

    public static void main(String[] args) {

        int n = 10000;

        // StringBuffer Test
        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer sbuffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sbuffer.append("AIET");
        }

        long endTimeBuffer = System.currentTimeMillis();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        // StringBuilder Test
        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder sbuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sbuilder.append("AIET");
        }

        long endTimeBuilder = System.currentTimeMillis();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        // Display results
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ms");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ms");

        // Conclusion
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster or equal to StringBuilder.");
        }
    }
}