import java.net.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;  

public class Server{
	public static void main(String args[])
	throws Exception{
		ServerSocket ss = new ServerSocket(4422);
		while(true)
		{
			Socket s = ss.accept();
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    		Date date = new Date(); 
			dos.writeUTF(formatter.format(date));
		}
	}
}
