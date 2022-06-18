public class ObjectOrientation1
{
	static int wheels=2;
	String color="";
	static void bracking()
		{
			System.out.println("bike halts when brakes appilied");
		}
		
		void mileage(int s)
		{
			System.out.println("mileage is "+s  +"kmph");
		}

		public static void main(String args[])
		{
			ObjectOrientation RoyalEnfield=new ObjectOrientation();
			ObjectOrientation R15=new ObjectOrientation();
			ObjectOrientation Duke=new ObjectOrientation();

			RoyalEnfield.mileage(40);
			R15.mileage(35);
			Duke.mileage(25);
			
			System.out.println(" ");
			
			RoyalEnfield.bracking();
			R15.bracking();
			Duke.bracking();
			
		}
}