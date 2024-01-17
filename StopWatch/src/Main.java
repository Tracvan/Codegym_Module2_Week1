import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
            StopWatch stopWatch = new StopWatch();

            selectionArraySort(array);

            stopWatch.stop();

            long result = stopWatch.getElapseTime();

        System.out.println("Run time is: " + result);
    }
    public static void selectionArraySort(int[] array){
        int n = array.length;
        for ( int i =0; i< n-1; i++){
            int minIndex = i;
            for( int j = i + 1; j < n; j++){
                if( array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}