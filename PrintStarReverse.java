/**
 * Created by Qiang Pan on 3/23/2017.
 * Print
 *   *
     **
     ***
     ****
     *****
 */
public class TEST {
    public static void main (String[] args)
    {
        int counter=1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<counter;j++)
            {
                System.out.print('*');
            }
            System.out.println();
            counter++;
        }
    }
}
