class sumthread extends Thread{
    private int x[],start,end,sum;

    sumthread(int a[],int start,int end){
        x=a;
        this.start=start;
        this.end=end;
    }

    public void run(){
        for(int i=start;i<end;i++){
            sum+=x[i];
        }
    }

    public int getSum(){
        return sum;
    }
}


class thread {
    public static void main(String[] args) {
        int nos[]= new int[1000];
        int total=0;

        for(int i =0;i<1000;i++){
            nos[i]=(int)(Math.random()*1000);
        }

        sumthread st[] = new sumthread[10];

        for(int i=0;i<10;i++){
            st[i]=new sumthread(nos, i*100, (i+1)*100-1);
            st[i].start();
        }

        for(int i=0;i<10;i++){
            try{
            st[i].join();
            }
            catch(Exception e){}
        }

        for(int i=0;i<10;i++){
            total+=st[i].getSum();
        }
        float average=total/1000;
        System.out.println("The sum of the 1000 randomly chosen numbers is "+total+"and the average is "+average);
    }
}
