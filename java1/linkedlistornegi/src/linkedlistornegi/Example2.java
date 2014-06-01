package linkedlistornegi;

import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Grup> grupList =new LinkedList<Grup>();
		Grup grup = new Grup();
		grup.setGrupName("Java grubu");
		grup.setGrupSeans("Hafta Sonu");
	    grup.setId(1);
	    grupList.addFirst(grup);
	   
	    Grup grup2 = new Grup();
	    grup2.setGrupName("c# grubu");
		grup2.setGrupSeans("Hafta içi");
	    grup2.setId(2);
	    grupList.addLast(grup2);
	    
	    Grup grup3 = new Grup();
	    grup3.setGrupName("Pyton grubu");
		grup3.setGrupSeans("Hafta Sonu");
	    grup3.setId(3);
	    grupList.addFirst(grup3);
	    
	    Grup grup4 = new Grup();
	    grup4.setGrupName("Php grubu");
		grup4.setGrupSeans("Pazartesi Günü");
	    grup4.setId(4);
	    grupList.addFirst(grup4);
	    
	    
	    
	    for (int i = 0; i < grupList.size(); i++) {
			
	    	System.out.println("ID :" + grupList.get(i).getId()+" Name :" +grupList.get(i).getGrupName());
		}
	   
	    
	}

}
