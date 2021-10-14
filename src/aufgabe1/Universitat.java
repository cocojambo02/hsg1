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

    //returns a list of grades, that have failed the class
    public List<Integer> failedClass(){
        List<Integer> failedStudents = new ArrayList<Integer>();


        for (int grade : this.grades) {
            if (grade < 40) {
                failedStudents.add(grade);
            }
        }
        return failedStudents;
    }

    //returns the avarage grade of all grades
    public double avgGrade(){
        /* sum()
         * Precondition: An array is given.
         * Postcondition: Returns int.
         * Returns the sum as int of all numbers in the array.
         */

        /* stream(dataType)
         * Precondition: An array, collection, list,... is given.
         * Postcondition: the given data tipe is pipelined to the next function.
         * Returns the result provide the result as per the pipelined methods.
         */
        int Sum = Arrays.stream(this.grades).sum();
        return Sum/this.grades.length;
    }

    //punkt3

    //rounds up a grade
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
    //returns list of rounded up grades
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
    //returns biggest grade after rounding up
    public int maxRoundedUpGrade(){
        /* max(stream, comparator(if null, ))
         * Precondition: List is given.
         * Postcondition: Returns x, x > a[1], a[2], a[3],...
         * Returns the maximal value of the given list.
         */
        return Collections.max(this.roundAllGrades(),null);
    }
 }
