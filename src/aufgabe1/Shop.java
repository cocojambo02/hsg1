package aufgabe1;

import java.util.Arrays;

public class Shop {
    private int[] usbs;
    private int[] keyboards;

    public Shop(int[] usbs, int[] keyboards) {
        this.usbs = usbs;
        Arrays.sort((this.usbs));
        this.keyboards = keyboards;
        Arrays.sort((this.keyboards));
    }

    public int[] getUsbs() {
        return usbs;
    }

    public void setUsbs(int[] usbs) {
        this.usbs = usbs;
    }

    public int[] getKeyboards() {
        return keyboards;
    }

    public void setKeyboards(int[] keyboards) {
        this.keyboards = keyboards;
    }

    public int mostExpensiveKeyboard(){
        return this.keyboards[this.keyboards.length - 1];
    }

    public int mostExpensiveThing(){
        int mostExpensiveUSB = this.usbs[this.usbs.length - 1];

        return Math.max(mostExpensiveUSB, this.mostExpensiveKeyboard());

    }

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

    public int maxSpent(int budget){
        if(this.usbs[0] + this.keyboards[0] > budget){
            return -1;
        }

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
