public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        return (.25 * (t1 + t2 + t3 + t4));
    }

    public int roundAverage(double average){
        return (int) (average + .5);
    }

    public boolean isPassing(int roundedAverage) {
        return (roundedAverage >= 65);
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        return (shares * price);
    }


    public int roundValueChange(double totalStock) {
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
            int hund  = ((((int) userDouble / 100) + 1) % 10) * 100;
            int ten  = ((((int) (userDouble % 100) / 10) + 1) % 10) * 10;
            int one  = ((((int) (userDouble % 10)) + 1) % 10);
            double tenth  = ((((int)(userDouble * 10)%10)+ 1.0) %10) /10;
            double hundth  = ((((userDouble * 100) % 100) + 1) % 10) / 100;
        return hund + ten + one  + tenth + hundth;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
