//final verison to eliminate Zeros
public class toHex_finalVer {
	public static void main(String[] args)
	{
		toHex_final(0);
		
	}
	
	public static void toHex_final(int num)
	{
		if(num==0)
		{
			System.out.print('0');
			return;
		}
		char[] table={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[8];
		int counter=arr.length;
		while(num!=0)
		{
			int temp= num&15;
			arr[--counter]=table[temp];
			num=num>>>4;
		}
		for(int i=counter;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
