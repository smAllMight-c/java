import java.io.*;
import java.util.*;

class linkedlist {
    public static void main(String args[]){
        LinkedList<String> colorList = new LinkedList<String>();
        colorList.add("red");
        colorList.add("blue");
        colorList.add("yellow");
        colorList.add("orange");

        Iterator it = colorList.listIterator();
        System.out.println("The list is");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Iterator itr=colorList.descendingIterator();
        System.out.println("The list reversed is");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        List colorList2 = new LinkedList();
        colorList2.add("pink");
        colorList2.add("green");

        colorList.addAll(2, colorList2);
        System.out.println("The modified color list is "+colorList);
    }
}