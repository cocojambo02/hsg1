package aufgabe1;

import java.util.*;

public class TheArray {
    //properties
    private int[] values;

    //constructor
    public TheArray(int[] values) {
        this.values = values;
        /*
         * Precondition: Every indexed variable of the array a has a value.
         * Postcondition: a[0] <= a[1] <= ... <= a[a.length - 1].
         * Uses merge sort algorythm on an array
         */
        Arrays.sort(this.values);
    }

    //array is already sorted, returns the last value of the array
    public int getMax(){
        return this.values[this.values.length - 1];
    }

    //array is already sorted, returns the first value of the array
    public int getMin(){
        return this.values[0];
    }

    //array is already sorted, returns sum of last n-1 numbers
    public int maxSum(){
        /* copyOfRange(stream, from, to)
         * Precondition: A list is given.
         * Postcondition: List is converted to other data type
         * Converts array to list.
         */

        /* sum()
         * Precondition: An array is given.
         * Postcondition: Returns int.
         * Returns the sum as int of all numbers in the array.
         */
        return Arrays.stream(Arrays.copyOfRange(this.values, 1, this.values.length)).sum();
    }

    //array is already sorted, returns sum of first n-1 numbers
    public int minSum(){
        return Arrays.stream(Arrays.copyOfRange(this.values, 0, this.values.length - 1)).sum();
    }
}
