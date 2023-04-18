import java.rmi.*;

public interface SortArrayInterface extends Remote {
    public int[] sort(int[] arr) throws RemoteException;
}
