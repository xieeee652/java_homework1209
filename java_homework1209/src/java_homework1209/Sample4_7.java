package java_homework1209;

public class Sample4_7 {
	public static void main(String[] args)
	{
		Car7 car = new Car7();
		
		car.setCar(1234,20.5);
		System.out.println(car);
	}
}
class Car7
{
	protected int num;
	protected double gas;

	public Car7()
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
