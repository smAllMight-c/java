package SY;

public class SYMarks{
	private int mathsTotal,elecTotal,compTotal;

	public SYMarks(int m, int e, int c){
		mathsTotal = m;
		elecTotal = e;
		compTotal = c;
	}

	public String toString(){
		return "Maths total:"+mathsTotal+
			"\nElectronics total:"+elecTotal+
			"\nComputer total:"+compTotal;
	}

	public int getCompTotal(){
		return compTotal;
	}
}



