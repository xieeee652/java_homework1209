package java_homework1209;

public class Sample4_5 {
	public static void main(String[] args)
	{
		Car5 car1 = new RacingCar5();
		car1.setCar(1234,20.5);
		car1.show();
	}
}
class Car5
{
	protected int num;
	protected double gas;

	public Car5()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	/*
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������" + num + "�A�T�o�q��" + gas + "�����l");
	}
	*/
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas);
	}
		
	public void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}

class RacingCar5 extends Car5
{
	private int course;
	
	public RacingCar5()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}	
	/*
	public RacingCar(int n,double g,int c)
	{
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F�s����" + course + "���ɨ�");
	}	
	*/
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��" + course);			
	}
	
	public void show()
	{
		System.out.println("�ɨ��������O" + num);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("�ɨ��s���O"+ course);
	}
	
}