public class Thread1
{

	class A1 implements Runnable
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=10;i++)
			{
				System.out.println("Thread A: "+i);
			}
		}
		
	}
	class B1 implements Runnable
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=10;i++)
			{
				System.out.println("Thread B: "+i);
			}
		}
		
	}

	public class Example2 
	{
		public void main(String[] args) {
			
			
			Thread t1 =new Thread(new A1());
			Thread t2 =new Thread(new B1());
			
			t1.start();
			t2.start();
			
			
		}
	}

}
