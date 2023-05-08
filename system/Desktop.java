package org.system;

public class Desktop extends Computer{
	public void desktopSize(){
		System.out.println("Desktop size:1920*108 pixels");
	}
     public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();
		

	}
}







