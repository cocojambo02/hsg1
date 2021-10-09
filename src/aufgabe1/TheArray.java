package aufgabe1;

import java.util.*;

public class TheArray {
    //properties
    private int[] values;

    //constructor
    public TheArray(int[] values) {
        this.values = values;
        Arrays.sort(this.values);
    }

    //getter
    public int[] getValues() {
        return values;
    }

    //setter
    public void setValues(int[] values) {
        this.values = values;
    }

    public int getMax(){
        return this.values[this.values.length - 1];
    }

    public int getMin(){
        return this.values[0];
    }

    public int maxSum(){
        return Arrays.stream(Arrays.copyOfRange(this.values, 1, this.values.length)).sum();
    }

    public int minSum(){
        return Arrays.stream(Arrays.copyOfRange(this.values, 0, this.values.length - 1)).sum();
    }
}
