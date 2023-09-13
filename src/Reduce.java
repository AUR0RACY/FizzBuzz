public class Reduce {
    public static void main(String[] args) {

        //Start with number 100.
        //Set total time to be 0.
        int start_number = 100;
        int total_time = 0;

        //Will not stop until reaches 0.
        while(start_number != 0){

            //Find if it's an even number.
            boolean EvenOrOdd = start_number % 2 == 0;

            if (EvenOrOdd) {
                start_number = start_number / 2;
            }
            else{
                start_number = start_number - 1;
            }
            total_time ++;
        }
        System.out.println("You need " + total_time + " steps to reach zero.");

    }
}
