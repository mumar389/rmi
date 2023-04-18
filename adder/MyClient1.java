import java.rmi.*;
import java.io.*;
public class MyClient1 {
    public static void main(String[] args) {
        BufferedReader br;
        String str=new String();
        int x,y;
        try {
            Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/abc");
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number");
            str=br.readLine();
            x=Integer.parseInt(str);
            System.out.println("Enter a number");
            str=br.readLine();
            y=Integer.parseInt(str);
            System.out.println("The Sum is-:");
            System.out.println(stub.add(x, y));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
