import java.rmi.*;
import java.rmi.server.*;

public class SortArrayServer extends UnicastRemoteObject implements SortArrayInterface {
    
    public SortArrayServer() throws RemoteException {
        super();
    }

    public int[] sort(int[] arr) throws RemoteException {
        int n = arr.length;
        
        // Bubble sort algorithm
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        try {
            SortArrayServer sortArray = new SortArrayServer();
            Naming.rebind("rmi://localhost:6000/SortArray", sortArray);
            System.out.println("SortArray is running...");
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
