package arrays.src;

// Array indices start from 0 and goes till (n-1) where n is the size of the array
public class integer_arrays {
    public static void main(String[] args) {
        int[] marks = new int[5];   //Declaration + memory allocation

        int[] roll_no;              //Declaration
        roll_no = new int[5];       //Memory Allocation

        String[] name = {"rohith", "rohan", "rahul", "nivas", "anshul"}; //Declaration + initialize
        for (int i = 0; i < 5; i++)
        {
            marks[i] = i;
        }
        marks[3] = 12;
        for (int i = 0; i < 5; i++)
        {
            System.out.println(marks[i]);        }
         }

}
