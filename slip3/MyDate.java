import java.io.*;
import java.util.*;
class InvalidDateException extends Exception{}

class MyDate {
    int day,month,year;

    MyDate () {
        day=0;
        month=0;
        year=0;
    }

  MyDate(int d,int m ,int y) {
        this.day=d;
        this.month=m;
        this.year=y;


        try {
            if(month<=0 || month >12) {
                throw new InvalidDateException();
            }

            else {
                switch(month) {
                    case 1: if(day>32) {
                        throw new InvalidDateException();
                        
                    }
                    case 2: if(day>28) {
                        throw new InvalidDateException();
                       

                    }
                    case 3: if(day>32) {
                        throw new InvalidDateException();
                     

                    }
                    case 4: if(day>30) {
                        throw new InvalidDateException();
                        

                    }
                }
                System.out.println("Date "+day+"/"+month+"/"+year+" is valid");

            }

        }
        catch(InvalidDateException e){
            System.out.println(e);
        }

        
        }
  
    }


    class date {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the date:dd mm yy");
            MyDate d = new MyDate(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
          
        }
    }

