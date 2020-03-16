import java.io.*;
import java.util.Scanner;

class CricketPlayer {
    String name;
     int no_of_innings;
    int no_of_times_notout;
     int totalruns;
     float bat_avg;

    CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totalruns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalruns = totalruns;

    }

    void setAverage(float avg) {
        bat_avg = avg;
    }

   
}

class cricketPlayer{
    public static void calcAverage(CricketPlayer q[]){
        int n=q.length;
        for(int i=0;i<n;i++){
            float t = q[i].totalruns/q[i].no_of_innings;
            q[i].setAverage(t);
        }
    }

    public static void sortPlayer(CricketPlayer q[]){
        int n= q.length;
        CricketPlayer c;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(q[i].bat_avg < q[j].bat_avg){
                    c=q[i];
                    q[i]=q[j];
                    q[j]=c;

                }
            }
        }

    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many players");
        n=scan.nextInt();
        CricketPlayer c[]= new CricketPlayer[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter the name");
            scan.nextLine();
            String name=scan.nextLine();
            System.out.println("Enter the number of innings played");
            int noi=scan.nextInt();
            System.out.println("Enter the number of times not out");
            int non=scan.nextInt();
            System.out.println("Enter the total runs");
            int tot=scan.nextInt();
            c[i]= new CricketPlayer(name, noi, non, tot);
            
        }
        calcAverage(c);
        for(int i=0;i<n;i++){
            System.out.println(c[i].name+" "+c[i].no_of_innings+" "+" "+c[i].bat_avg);
        }
        sortPlayer(c);
        System.out.println("The sorted order is");
        for(int i=0;i<n;i++){
            System.out.println(c[i].name+" "+c[i].no_of_innings+" "+" "+c[i].bat_avg);
        }
    }
}