package aufgabe1;

public class TwoBigNumbers {
    private int nr1, nr2;

    public TwoBigNumbers(int nr1, int nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }

    public int getNr1() {
        return nr1;
    }

    public void setNr1(int nr1) {
        this.nr1 = nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public void setNr2(int nr2) {
        this.nr2 = nr2;
    }

    public boolean nrHaveSameLen(){

        int theNr1 = this.nr1;
        int theNr2 = this.nr2;

        while(theNr1 != 0 && theNr2 != 0){
            theNr1 /= 10;
            theNr2 /= 10;
        }

        return theNr1 == 0 && theNr2 == 0;

    }

    public int digitSum() throws Exception {

        //just a test to check, if the numbers actually have the same size
        if(!this.nrHaveSameLen()){
            throw new Exception("Numbers are different sizes, add not possible!");
        }

        //actuall add
        else{
            return this.nr1 + this.nr2;
        }
    }

    public int digitDiff() throws Exception {

        //just a test to check, if the numbers actually have the same size
        if(!this.nrHaveSameLen()){
            throw new Exception("Numbers are different sizes, add not possible!");
        }

        //actuall diff
        else {
                return Math.abs(this.nr1 - this.nr2);
        }
    }

    public boolean oneIsSingleDigit(){
        return this.nr1/10 == 0 || this.nr2/10 == 0;
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
