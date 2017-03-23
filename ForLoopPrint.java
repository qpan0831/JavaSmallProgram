/*
print

54321
5432
543
54
5
***********************************************
1
22
333
4444
55555
*/
class ForLoopPrint{
    public static void main( String [] args)
        {
            for(int i=0;i<5;i++)
            {
                for(int j=5;j>i;j--)
                {
                    System.out.print(j);
                }
                System.out.println();

            }
            System.out.println("***********************************************");

            for(int i=1;i<6;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();

            }

        }
}
