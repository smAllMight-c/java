import java.io.*;
import java.net.*;

public class server {
     public static void main(String[] args) {
     try{
     ServerSocket ss = new ServerSocket(9991);
     Socket s = ss.accept();
     DataInputStream dis = new DataInputStream(s.getInputStream());
     String str="";
     while(!str.equals("END")) {
     str=dis.readUTF();
     System.out.println("The client says " + str);
     }
     dis.close();
     s.close();
     ss.close();
     }
     catch(Exception e) {
     System.out.println(e);
     }
     }

}
