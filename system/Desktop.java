package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		
		System.out.println("My desktop size Dimensionly 357.88 x 255 x 23.6 mm 14.09 x 10.04 x 0.93 inches");
	}
	
	public static void main(String[] args) {
		
		Computer cpt=new Computer();
		cpt.computerModel();
		
		Desktop dk=new Desktop();
		dk.desktopSize();
		
	}
	
	
}
