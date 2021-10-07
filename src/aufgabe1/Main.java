package aufgabe1;

public class Main {

    public static void main(String[] args) {
        int[] theGrades = {25, 30, 33, 34, 45, 50, 63, 98, 82, 86};
	    Universitat uni = new Universitat(theGrades);
        System.out.println(uni.failedClass());
        System.out.println(uni.avgGrade());
        System.out.println(uni.roundGrade(1));
        System.out.println(uni.roundGrade(2));
        System.out.println(uni.roundGrade(3));
        System.out.println(uni.roundAllGrades());
        System.out.println(uni.maxRoundedUpGrade());
    }
}
