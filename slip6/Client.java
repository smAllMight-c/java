import java.io.*;
import java.net.*;
public class client {
public static void main(String[] args) {
     try{
          Socket s = new Socket("localhost",9991);
          DataOutputStream dos = new DataOutputStream(s.getOutputStream());
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
          String str="";
          while(!str.equals("END")) {
          str=br.readLine();
           dos.writeUTF(str);
          dos.flush();
          }
          dos.close();
          s.close();
     }
     catch(Exception e) {
     System.out.println(e);
     }
}
}
