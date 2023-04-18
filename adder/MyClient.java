import java.rmi.*;
public class MyClient {
    public static void main(String args[]) {
        try {
            Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/abc");
            System.out.println(stub.add(3, 4));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);

        }
    }
}
