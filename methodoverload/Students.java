package methodoverload;

public class Students {
	public void getStudentInfo(int id)
	{
	    System.out.println("Student Id: "+id);
	}
    public void getStudentInfo(int id,String name)
    {
    	System.out.println("student Id & Name :"+id+"&"+name);
    
    }
    public void getStudentInfo(String mailid,long mobileno)
    {
    	System.out.println("Mail Id: "+mailid);
    	System.out.println("Mobile no: "+mobileno);
    }
   
	public static void main(String[] args) {
		
		Students std1=new Students();
		std1.getStudentInfo(54321);
		std1.getStudentInfo(54321,"Lakshmi");
		std1.getStudentInfo("Lakshmisai09@gmail.com",9551866575L);
	

	}

}
