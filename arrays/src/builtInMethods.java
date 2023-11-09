package arrays.src;
import java.util.Arrays; // for using extra built in methods import the Arrays method from the util package

public class builtInMethods {
    public static void main(String[] args) {
        float percentage[] = {89.5f, 12.5f, 11.23f};
        System.out.println(percentage.length); // .length prints the length of the array
        Arrays.sort(percentage); //
//      Another method to display elements in an array, it is similar to the (for i in x) syntax in python
//      It is known as (for each loop)
        for (float each : percentage)
        {
            System.out.println(each);
        }

        float arr[] = {1,5,2,3};
        float arr1[] = {1,5,2,3};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (float i: arr)
        {
            System.out.println(i);
        }

        System.out.println(Arrays.compare(arr1, arr)); // return 0 if both the arrays are same and 1 if they are different
        float sample[] = Arrays.copyOfRange(arr, 1, 3); // copies the elements from index 1 to index 3 to new array sample[]
        for (float i : sample)
        {
            System.out.println(i);
        }
    }
}
