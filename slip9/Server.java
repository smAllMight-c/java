import java.io.*;
import java.net.*;

class Server{
	public static void main(String args[])
	throws Exception{
		ServerSocket ss = new ServerSocket(7080);
		
		while(true)
		{
			Socket s = ss.accept();

			DataOutputStream toClient = new DataOutputStream(
							s.getOutputStream());

			DataInputStream fromClient = new DataInputStream(
							s.getInputStream());

			String fileName = fromClient.readUTF();

			File f = new File(fileName);

			if(f.exists()){
				String str=null;
				DataInputStream dis = new DataInputStream(
							new FileInputStream(f));
				while((str=dis.readUTF())!=null)
				{
					toClient.writeUTF(str+"\n");
				}
			}
			else{
				toClient.writeUTF("File "+fileName+" not found.\n");
			}
			toClient.writeUTF("END\n");
		}
	}
}
