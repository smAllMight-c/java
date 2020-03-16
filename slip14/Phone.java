import java.io.*;
import java.util.Scanner;

class phone{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int ch;
        String name,search,enter;
        while(true){
            System.out.println("Here are your choices\n1:Search name\n2:Add name,phonenumber\n3:Exit");
            ch=scan.nextInt();
            switch (ch) {
                case 1:System.out.println("Enter the name to be searched");
                scan.nextLine();
                        name=scan.nextLine();
                        BufferedReader br = new BufferedReader(new FileReader("phone.txt"));

                        while((search=br.readLine())!=null){
                            String searchS[]=search.split(" ");
                            if(searchS[0].equals(name)){
                                System.out.println("The phone number for "+searchS[0]+" is "+searchS[1]);
                            }
                        }
                    
                    break;
                case 2:
                        System.out.println("Enter the new name and phone number");
                        scan.nextLine();
                        enter=scan.nextLine();
                        
                        BufferedWriter bw = new BufferedWriter(new FileWriter("phone.txt",true));
                        bw.write(enter+"\n");
                        bw.close();
                        break;
                case 3: System.exit(0);
                default:
                    break;
            }
        }
    }
}
