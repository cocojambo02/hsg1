package aufgabe1;

import java.util.Arrays;

public class Shop {
    private int[] usbs;
    private int[] keyboards;

    //constructor
    public Shop(int[] usbs, int[] keyboards) {
        this.usbs = usbs;
        Arrays.sort((this.usbs));
        this.keyboards = keyboards;
        /*
         * Precondition: Every indexed variable of the array a has a value.
         * Postcondition: a[0] <= a[1] <= ... <= a[a.length - 1].
         * Uses merge sort algorythm on an array
         */
        Arrays.sort(this.keyboards);
    }

    //returns the most expensive keyboard out of the array with keyboard proces
    public int mostExpensiveKeyboard(){
        return this.keyboards[this.keyboards.length - 1];
    }

    //returns the most expensive keyboard/usb from the shop
    public int mostExpensiveThing(){
        int mostExpensiveUSB = this.usbs[this.usbs.length - 1];

        return Math.max(mostExpensiveUSB, this.mostExpensiveKeyboard());

    }

    //returns the most expensive usb, the customer could buy
    public int mostExpensiveAffordableUsb(int budget){

        if(budget < this.usbs[0]){
            return -1;
        }

        int answer = this.usbs[0];
        for(int usb : this.usbs){
            if (usb == budget){
                return usb;
            }
            else{
                if(budget < usb){
                    return answer;
                }

                answer = usb;
            }
        }

        return this.usbs[this.usbs.length - 1];
    }


    //searches for a combination of keyboard+usb, a customer could buy
    public int maxSpent(int budget){
        //cannot afford anything case
        if(this.usbs[0] + this.keyboards[0] > budget){
            return -1;
        }

        //search of most expensive combination
        else{
            int maxi = -1;
            for(int usb : this.usbs){
                for(int keyboard : this.keyboards){
                    if(keyboard + usb > maxi && keyboard + usb < budget){
                        maxi = keyboard + usb;
                    }
                }
            }

            return maxi;
        }


    }
}
