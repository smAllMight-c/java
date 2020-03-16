import java.io.*;
class File{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name=args[0];
		File file = new File(name);
		if(file.isFile()){
			System.out.println(name+" is a file.");
			System.out.println("Path      : "+file.getPath());
			System.out.println("File Size : "+file.length()+" bytes");
		}
		if(file.isDirectory()){
			System.out.println(name+" is a directory.");
			String names[]=file.list();
			int count=0;
			for(int i=0;i<names.length;i++){
				File f = new File(name+"/"+names[i]);
				if(f.isFile()){
					if(names[i].endsWith(".txt")){
						System.out.print("Delete Y/N?");
						String ch=br.readLine();
						if(ch.equals("Y")){
							f.delete();
							count++;
						}
					}
				}
			}
			System.out.println("No.of file in directory "+name+":"+count);
		}
	}
}
