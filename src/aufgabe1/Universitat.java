package aufgabe1;


import java.util.*;


public class Universitat {

    //properties
    private int[] grades;

    //constructor
    public Universitat(int[] grades) {
        this.grades = grades;
    }

    //methods
    //punkt 1
    public List<Integer> failedClass(){
        List<Integer> failedStudents = new ArrayList<Integer>();


        for (int grade : this.grades) {
            if (grade < 40) {
                failedStudents.add(grade);
            }
        }
        return failedStudents;
    }

    //punkt 2
    public double avgGrade(){
        int Sum = Arrays.stream(this.grades).sum();
        return Sum/this.grades.length;
    }

    //punkt3

    //round grade
    public int roundGrade(int grade){
        if( (grade + 1)%5 == 0 && grade > 38){
            return  grade + 1;
        }

        if( (grade + 2)%5 == 0 && grade > 38){
            return grade + 2;
        }

        return grade;
    }

    //round all grades
    public List<Integer> roundAllGrades(){

        List<Integer> roundedGrades = new ArrayList<Integer>();

        for(int grade : this.grades){
            if(grade != roundGrade(grade)){
                roundedGrades.add(roundGrade(grade));
            }
        }

        return roundedGrades;
    }

    //punkt 4
    public int maxRoundedUpGrade(){
        return Collections.max(this.roundAllGrades(),null);
    }
 }
