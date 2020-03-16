import java.io.*;
import java.util.Scanner;


class items {
    int id,price,qty;
    String name;
    
  
    

    public  items(int id,String name ,int price,int qty) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.qty=qty;
    }
    public String toString(){
		return "Id = "+id+"\tName= "+name+"\tPrice= "+price+"\tQuantity = "+qty;
	}

	public String getName(){
		return name;
	}

	public int getPrice(){
		return price;
	}
}

class item {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int ch,count=0;
        String item[],items,itemName;
        RandomAccessFile rf = new RandomAccessFile("item.dat", "rw");
        items i[] = new items[20];
        while((items=rf.readLine())!=null){
            item=items.split(" ");
            i[count] = new items(Integer.parseInt(item[0]),item[1],Integer.parseInt(item[2]),Integer.parseInt(item[3]));
            count++;
        }

        while(true){
            System.out.println("Here are your choice:\n1:Search for a specfic item by name\n2:Find Costliest item\n3:Display all items");

            ch = scan.nextInt();
            switch (ch) {
                case 1:
                        System.out.println("Enter the name of the item"); 
                        scan.nextLine();                   
                        itemName=scan.nextLine();
                        for(int j=0;j<count;j++){
                                if(i[j].getName().equals(itemName)){
                                   System.out.println(i[j].toString()); 
                                }
                        }
                    break;
                
                    case 2:
                        System.out.println("The costliest item is ");
                        int max=0;
                        String maxname="";
                        for(int j=0;j<count;j++){
                            if(i[j].getPrice()>max){
                                max=i[j].getPrice();
                                maxname=i[j].getName();
                            }
                        }
                        System.out.println(maxname);
                        break;
                    
                    case 3: System.out.println("Displaying all items");
                            for(int j=0;j<count;j++){
                                System.out.println(i[j].toString());
                            }
                default:
                    break;
            }
        }
    }
}