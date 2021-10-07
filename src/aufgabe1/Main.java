package aufgabe1;

public class Main {

    public static void main(String[] args) {
        //unit tests ex1
        int[] theGrades = {25, 30, 33, 34, 45, 50, 63, 98, 82, 86};
	    Universitat uni = new Universitat(theGrades);
        System.out.println(uni.failedClass());
        System.out.println(uni.avgGrade());
        System.out.println(uni.roundGrade(1));
        System.out.println(uni.roundGrade(2));
        System.out.println(uni.roundGrade(3));
        System.out.println(uni.roundAllGrades());
        System.out.println(uni.maxRoundedUpGrade());

        //unit tests ex2
        int[] theValues = {25, 30, 33, 34, 45, 50, 63, 98, 82, 86};
        TheArray arr = new TheArray(theValues);
        System.out.println(arr.getMax());
        System.out.println(arr.getMin());
        System.out.println(arr.maxSum());
        System.out.println(arr.minSum());

        //unit test ex3
        int a = 200, b = 300;
        TwoBigNumbers big1 = new TwoBigNumbers(a, b);
        System.out.println(big1.nrHaveSameLen());

        int c = 200, d = 3;
        TwoBigNumbers big2 = new TwoBigNumbers(c, d);
        System.out.println(big2.nrHaveSameLen());

        int e = 3, f = 200;
        TwoBigNumbers big3 = new TwoBigNumbers(e, f);
        System.out.println(big3.nrHaveSameLen());

        //sum test
        try{
            System.out.println(big1.digitSum());
        }
        catch(Exception exept){
            exept.printStackTrace();
        }

        try{
            System.out.println(big2.digitSum());
        }
        catch(Exception exept){
            exept.printStackTrace();
        }

        //diff test
        try{
            System.out.println(big1.digitDiff());
        }
        catch(Exception exept){
            exept.printStackTrace();
        }

        try{
            System.out.println(big2.digitDiff());
        }
        catch(Exception exept){
            exept.printStackTrace();
        }

        //side function test
        System.out.println(big1.oneIsSingleDigit());
        System.out.println(big2.oneIsSingleDigit());

        //mul test
        try{
            System.out.println(big1.digitMul());
        }
        catch(Exception exept){
            exept.printStackTrace();
        }

        try{
            System.out.println(big2.digitMul());
        }
        catch(Exception exept){
            exept.printStackTrace();
        }

        //div test
        try{
            System.out.println(big1.digitDiv());
        }
        catch(Exception exept){
            exept.printStackTrace();
        }

        try{
            System.out.println(big2.digitDiv());
        }
        catch(Exception exept){
            exept.printStackTrace();
        }

        //test aufgabe 4

        int[] theKeyboards = {25, 30, 33, 34, 45, 50, 63, 98, 82, 86};
        int[] theUsbs = {2, 18, 3 ,4 ,7 ,9 ,12 ,14};
        Shop theShop = new Shop(theUsbs, theKeyboards);
        System.out.println(theShop.mostExpensiveKeyboard());
        System.out.println(theShop.mostExpensiveThing());
        System.out.println(theShop.mostExpensiveAffordableUsb(1));
        System.out.println(theShop.mostExpensiveAffordableUsb(14));
        System.out.println(theShop.mostExpensiveAffordableUsb(100));
        System.out.println(theShop.maxSpent(60));
        System.out.println(theShop.maxSpent(3));
    }
}
