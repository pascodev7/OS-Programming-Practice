package StatisticalValue;

public class MinThread implements Runnable{

    //attributes
    String name;
    Thread tMinimum;
    private int minimum;

    //Constructor of the MinThread class
    public MinThread(String name) {
        this.name = name;
        tMinimum = new Thread(this, name);
        tMinimum.start();
    }

    @Override
    public void run() {

        try{
            // By default, the smallest value is the first element of the array
            int min =MainThread.arr[0];
            for(int i=0; i<MainThread.arr.length; i++){
                // If we find a smaller number, we replace the prior number
                if(MainThread.arr[i] < min)
                    min = MainThread.arr[i];
            }
            minimum = min;

        }finally{
            System.out.println("Calculated minimum.");
        }
        System.out.println("Minimum Thread exiting");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("\n");
    }

    // recuperer la valeur dans mininimum
    public int getMinimum(){
        return minimum;
    }
}
