package series;
public class Prime{
	public void print_series(int no){
		for(int i=1;i<=no;i++){
         		int flag=0;
                        for(int j=2;j<i;j++){
                        	if(i%j==0){
					flag=1;
                                        break;
                              	}
			}
                        if(flag==0)
                        	System.out.println(i+" ");
               	}
	}
}
