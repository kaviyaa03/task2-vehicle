package tnsc25;

public class vehiclemain extends vehicle {
	
	public vehiclemain(int year,String model,String make) {
		super(year,model,make);
		
	}
	
	public static void main(String [] args) {
		
		car c1=new car(2002,"BMW","BENZ",4);
		c1.display();
		
		motorcycle m1=new motorcycle(2003,"HONDA","Harley",200);
		m1.display();
		
		
		
	}

}
