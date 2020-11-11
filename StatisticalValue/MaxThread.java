package StatisticalValue;

public class MaxThread implements Runnable{

    // attributes
    String name;
    Thread tMaximum;
    private int maximum;

    // Constructor
    public MaxThread(String name) {
        this.name = name;
        // instance of the Maximum Thread
        tMaximum = new Thread(this, name);
        // Creation of the maximum thread
        tMaximum.start();

    }

    @Override
    public void run() {
        try{
            // By default, the greatest value is the first element of the array
            int max =MainThread.arr[0];
            for(int i=0; i<MainThread.arr.length; i++){
                // If we find a smaller number, we replace the prior number
                if(MainThread.arr[i] > max)
                    max = MainThread.arr[i];
            }
            maximum = max;

        }finally{
            System.out.println("Calculated maximum.");
        }
        System.out.println("Maximum Thread exiting");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("\n");
    }

    // The maximum is returned
    public int getMaximum(){
        return maximum;
    }
}
