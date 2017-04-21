
public class ArrayPractice {
	public static void main(String[] args)
	{
		toHex(60);
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
}
