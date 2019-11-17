import java.util.Scanner;

public class TeilSumme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers should be read?");
        int nr = sc.nextInt();
        double displaysum = 0;
        int displayindex2 = 0;
        int displayindex = 0;
        float[] A = new float[nr];
        float sum = 0;
        double min = Integer.MAX_VALUE;
        int count = 1;
        double pie = Math.PI;
        System.out.print("Enter the " + count + "st number:");
        A[count - 1] = sc.nextFloat();
        count++;
        System.out.print("Enter the " + count + "nd number:");
        A[count -1] = sc.nextFloat();
        count++;
        System.out.print("Enter the " + count + "rd number:");
        A[count -1] = sc.nextFloat();
        count++;
        while(count <= nr)
        {
            System.out.print("Enter the " + count + "th number:");
            A[count -1] = sc.nextFloat();
            count++;
        }

        for (int i = 0; i < A.length; i++) {

            sum = A[i];

            for (int j = i + 1; j < A.length; j++) {

                if((pie - sum) < min){
                    displaysum = sum;
                    displayindex2 = j - 1;
                    displayindex = i;
                }
                if (sum > pie)
                    break;
                sum = sum + A[j];
            }
        }
        System.out.println("Best subset sum:");
        System.out.print(displaysum + " [");
        System.out.print(A[displayindex]);
        for (int i = displayindex + 1 ;i <= displayindex2 ; i++) {
            System.out.print(", " + A[i]);
        }
        System.out.println("]");


    }
}
