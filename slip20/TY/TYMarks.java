package TY;

public class TYMarks{
	private int theoryTotal,pracTotal;

	public TYMarks(int t, int p){
		theoryTotal = t;
		pracTotal = p;
	}

	public String toString(){
		return "Theory total:"+theoryTotal+
			"\nPractical total:"+pracTotal;
	}

	public int getTheory(){
		return theoryTotal;
	}

	public int getPractical(){
		return pracTotal;
	}
}


	





