package StatisticalValue;

public class AverageThread implements Runnable {

    // attributes
    String name;
    Thread tAverage;
    private int average;
    int sum = 0;

    // constructor
    public AverageThread(String name) {
        this.name = name;
        tAverage = new Thread(this, name);
        tAverage.start();
    }

    @Override
    public void run() {
        try{
            for(int i=0; i<MainThread.arr.length; i++)
                sum+= MainThread.arr[i];

            average = sum/MainThread.arr.length;
        }finally{
            System.out.println("Calculated average.");
        }
        System.out.println("Average Thread exiting");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("\n");
    }

    public int getAverage(){
        return average;
    }
}

