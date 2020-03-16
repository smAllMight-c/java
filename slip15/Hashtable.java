import java.io.*;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

class hashtable {
    public static void main(String[] args){
        Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
        String names[]={"Chaitanya","Anosh","Lalit"};
        int pers[]={86,80,84};
        System.out.println("How many records do you want to enter?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
           
            ht.put(names[i],pers[i]);
        }
        System.out.println("The contents of the hash table are"+ht);
        System.out.println("Enter the name to be searched");
        scan.nextLine();
        String search=scan.nextLine();
        if(ht.containsKey(search)){
            System.out.println("The percentage is "+ht.get(search));
        }
        else
        System.out.println("The name is not present");

       
    }
}