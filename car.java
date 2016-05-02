
public class car 
{
	static int wheel=4;
	String model;
	int  price;
	
	

	public static void main(String[] args) 
	{
		car c1=new car();
		car c2=new car();
		c1.model="audi";
		c1.price=1000000;
		c2.model="benz";
		c2.price=5000000;
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c2.model);
		System.out.println(c2.price);
		System.out.println(car.wheel);
		System.out.println(c1.wheel);
		c1.wheel=5;
		System.out.println(car.wheel);
		
		
		
		
	}
	

}
