package Basic;
import java.util.Arrays;
import java.util.Scanner;
public class InsertArray {
    public static void main(String[] args) {
        int[] arr=new int[3];

        arr[3]=8987;
        arr[4]=87654;
        System.out.println(Arrays.toString(arr));

        Scanner scan=new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter your  number");
            arr[i]=scan.nextInt();
        }

        for (int sam:arr)
        {
            System.out.println(sam);
        }

    }

}
