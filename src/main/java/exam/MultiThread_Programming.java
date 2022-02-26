package exam;

public class MultiThread_Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new newthread();
	}

}
class newthread extends Thread
{
	newthread()
	{
		super("My thread");
		start();
	}
	public void run()
	{
		System.out.println(this);
	}
}
