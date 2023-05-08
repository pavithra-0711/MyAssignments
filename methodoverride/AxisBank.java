package methodoverride;

public class AxisBank extends Bankinfo{
	public void deposit()
	{
		System.out.println("The Axis Minimum deposit amt:Rs:50,000");
	}

public static void main(String[] args) {
	AxisBank ab=new AxisBank();
	ab.deposit();
	
}

}
