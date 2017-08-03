
public class Other {

	public static void main( String[] args ) throws Exception
	{
		int repeats = 5;
		int steps_per_second = 10;
		for ( int i=0; i<repeats*11; i++ )
		{
			if ( i%10 == 0 )
				System.out.println("...sSs...\r");
			else if (i%10 == 1)
				System.out.println("....sSs..\r");
			else if (i%10 == 2)
				System.out.println(".....sSs.\r");
			else if (i%10 == 3)
				System.out.println("......sSs\r");
			else if (i%10 == 4)
				System.out.println("sSs......\r");
			else if (i%10 == 5)
				System.out.println(".sSs.....\r");
			else if (i%10 == 6)
				System.out.println("..sSs....\r");
			else if (i%10 == 7)
				System.out.println("...sSs...\r");
			else if (i%10 == 8)
				System.out.println("....sSs..\r");
			else if (i%10 == 9)
				System.out.println(".....sSs.\r");
			else if (i%10 == 10)
				System.out.println("......sSs\r");
			Thread.sleep(1000/steps_per_second);
		}
		
	}
}
