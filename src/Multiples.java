public class Multiples {
    public static void main(String[] args) {

        //Count the number of valid answer.
        int total_number = 0;

        for (int i = 1; i < 1000; i++){

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3) {

                System.out.println(i);
                total_number++;

            } else if (divisibleBy5) {

                System.out.println(i);
                total_number++;

            }
        }
        System.out.println("There are " + total_number + " valid numbers in total.");
    }
}
