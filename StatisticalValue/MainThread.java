package StatisticalValue;

import java.util.Scanner;

public class MainThread {



    //creer objet de type Scanner
    static Scanner in = new Scanner(System.in);

    // Attributes
    private static int finalAverage;
    private static int finalMaximum;
    private static int finalMinimum;

    // declaration du tableau d'elements
    public static int[] arr = new int[5];


    public static void main(String[] args) {

        System.out.println("Enter the numbers: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = in.nextInt();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("The numbers you entered are: ");
        for(int x:arr){
            System.out.print(x+ "  ");
        }
        System.out.println("\n------------------------------------------------------------------------------");
        System.out.println("\n\n");

        // The Threads instanciations
        AverageThread averageObject = new AverageThread("Average");
        MaxThread maximumObject = new MaxThread("Maximum");
        MinThread minimumObject = new MinThread("Minimum");

        // Average of the numbers
        try{
            averageObject.tAverage.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        finalAverage = averageObject.getAverage();
        System.out.println("The average of the numbers is: " +finalAverage);



        // maximum of the numbers
        try{
            maximumObject.tMaximum.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        finalMaximum = maximumObject.getMaximum();
        System.out.println("The maximum of the numbers is: " +finalMaximum);



        // Minimum of the numbers
        try{
            minimumObject.tMinimum.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        finalMinimum = minimumObject.getMinimum();
        System.out.println("The minimum of the numbers is: " +finalMinimum);


    }
}
