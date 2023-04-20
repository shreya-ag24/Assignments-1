import java.util.ArrayList;
import java.util.Scanner;

public class Day1_CartAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer>prices = new ArrayList<>();
        while(sc.hasNextInt()){
            prices.add(sc.nextInt());
        }
        int arr[] = getDiscountAndSum(prices);
        int discount = arr[0];
        int totalSum =arr[1];
        int finalValue = arr[2];

        System.out.println("discount: "+discount );
        System.out.println("totalSum: "+totalSum );
        System.out.println("finalValue: "+finalValue );
    }
    public static int[] getDiscountAndSum(ArrayList<Integer> list){
        int sum = 0;
        int arr[]= new int[3];
        for(int i:list){
            sum+=i;
        }
        if(sum >10000){
            arr[0]=10;
            arr[1] = sum;
            arr[2]=(int)(sum-(sum*0.2));
            return arr;
        }
        else {
            arr[0]=1;
            arr[1] = sum;
            arr[2]= sum;
            return arr;
        }
    }

}
