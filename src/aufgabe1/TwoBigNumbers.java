package aufgabe1;

import java.util.*;

public class TwoBigNumbers {
    private int nr1;
    private int nr2;

    //constructor
    public TwoBigNumbers(int nr1, int nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }


    //tests if two given numbers have the same lenght
    public boolean nrHaveSameLen(){

        int theNr1 = this.nr1;
        int theNr2 = this.nr2;

        while(theNr1 != 0 && theNr2 != 0){
            theNr1 /= 10;
            theNr2 /= 10;
        }

        return theNr1 == 0 && theNr2 == 0;

    }

    //converts an integer to a List of integers
    public List<Integer> integerToListOfInt(int theNumber){

        //prepare for char conversion
        String n1 = String.valueOf(theNumber);

        List<Character> chrDigits1 = new ArrayList<>();

        for(char ch : n1.toCharArray()){

            chrDigits1.add(ch);
        }

        List<Integer> digits1 = new ArrayList<>();

        for(char ch : chrDigits1){
            /* Character.getNumericValue(x);
             * Precondition: x is char.
             * Postcondition: x = int(x)
             * Returns numeric value of a char.
             */
            digits1.add(Character.getNumericValue(ch));
        }

        //no resize needed later
        digits1.add(0, 0);

        return digits1;
    }

    //parses a list of integers to a single integer
    public int backToInt(int[] array){
        int factor = 1;
        int answer = 0;
        for(int i = array.length-1; i >= 0; i--){
            answer += factor * array[i];
            factor *= 10;
        }

        return answer;
    }

    //sum amongst the single digits of the two numbers
    public int digitSum() throws Exception {

        //just a test to check, if the numbers actually have the same size
        if(!this.nrHaveSameLen()){
            throw new Exception("Numbers are different sizes, add not possible!");
        }


        else{

            int size = integerToListOfInt(this.nr1).size();

            int[] digits1 = integerToListOfInt(this.nr1).stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

            int[] digits2 = integerToListOfInt(this.nr2).stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

            int[] aux = new int[size];
            /* x.fill(y, z);
             * Precondition: Y is a stream.
             * Postcondition: y[0] = z, y[1] = z, y[2] = z, ....
             * Fills a stream with the given z.
             */
            Arrays.fill(aux, 0);


            //actuall add
            for(int i = size-1; i >= 0; i--){
                if(digits1[i] + digits2[i] > 9){
                    aux[i] += (digits1[i] + digits2[i]) % 10;
                    aux[i - 1]++;
                }
                else{
                    aux[i] += digits1[i] + digits2[i];
                }
            }

            return backToInt(aux);

        }
    }

    public int digitDiff() throws Exception {

        //just a test to check, if the numbers actually have the same size
        if(!this.nrHaveSameLen()){
            throw new Exception("Numbers are different sizes, add not possible!");
        }

        //actuall diff
        else {
            /* Math.abs(x);
             * Precondition: Pass int, long, double as parameter.
             * Postcondition: If x < 0, return (-1)*x, else return x
             * Returns the absolute value of the given number.
             */
            return Math.abs(this.nr1 - this.nr2);
        }
    }

    //tests if one of the given numbers is a single digit
    public boolean oneIsSingleDigit(){
        return this.nr1/10 == 0 ^ this.nr2/10 == 0;
    }

    public int digitMul() throws Exception {

        //just a test to check, if one of the numbers actually has only one digit
        if(!this.oneIsSingleDigit()){
            throw new Exception("One of the numbers is too big, mul not possible!");
        }

        //actuall mul
        else{
            return this.nr1 * this.nr2;
        }
    }

    public int digitDiv() throws Exception {

        //just a test to check, if one of the numbers actually has only one digit
        if(!this.oneIsSingleDigit()){
            throw new Exception("One of the numbers is too big, mul not possible!");
        }

        //actuall div
        else{
            if(this.nr1 / this.nr2 < 1){
                return this.nr2 / this.nr1;
            }

            return this.nr1 / this.nr2;
        }
    }
}
