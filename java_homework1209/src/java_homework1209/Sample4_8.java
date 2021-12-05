package java_homework1209;

public class Sample4_8 {
	public static void main(String[] args)
	{
		Car8 car1 = new Car8();
		Car8 car2 = new Car8();
		Car8 car3;
		car3 = car1;
		
		System.out.println("car1 跟 car2 相同" + car1.equals(car2));
		System.out.println("car1 跟 car3 相同" + car1.equals(car3));
		
	}
}
class Car8
{
	protected int num;
	protected double gas;

	public Car8()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	/*
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	*/
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
		
	public String toString()
	{
		String str = "車號:" + num + ";汽油量:" +gas;
		return str;
	}
}