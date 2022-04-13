/**
 * Java Overload Activity
 * 
 * @author Nicolas, Nigel D.
 */
public class App {
    /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */

    /**
     * 
     * Create method that returns the greater integer value
     */

     
    /**
     * 
     * Create method that returns the greater double value
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */

        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + Value.greaterValue(45,100));
        
        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + Value.greaterValue(3.14,9.8));
        System.out.println("===========================================");
        //This code will print the sum of 2 and 3 numbers
        System.out.println("Computing two numbers 40 and 20 = " + App.sum2(40, 20));
        System.out.println("Computing three numbers 20, 30, and 40 = " + App.sum3(20, 30, 40));
    }
}

