package week1.day1;

public class Mobile {
	public void makeCall(){
		        String mobileModel="Samsung";
		        float mobileWeight=25f;
				System.out.println("Mobile model:" +mobileModel);
		        System.out.println("Mobile Weight:" +mobileWeight);
	}
	private void sendMsg(){
		        boolean isFullCharged= true;
		        int mobileCost= 30000;
		        System.out.println("Mobile is fully charged:" +isFullCharged);
		        System.out.println("Mobile Weight is:" +mobileCost);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
    }
}
