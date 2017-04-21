
public class ArrayPractice {
	public static void main(String[] args)
	{
		toHex_2(60);
	}
	
	static void toHex(int num)
	{
		for(int i=0;i<8;i++)
		{
			int temp=num & 15;
			if(temp>9)
			{
				System.out.print((char)(temp-10+'A'));
			}
			else
			{
				System.out.print(temp);
			}
			num=num>>>4;
		}
	}
	
	static void toHex_2(int num)
	{
		char [] table={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		for(int i=0;i<8;i++)
		{
			int temp=num & 15;
			System.out.print(table[temp]);
			num=num>>>4;

		}
		
	}
}
