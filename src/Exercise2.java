import static java.util.stream.LongStream.rangeClosed;
import java.util.Scanner;
public class Exercise2 {
    
   public static void main(String[] args) {
        int count_Deficient_no = 0;
        int count_Perfect_no = 0;
        int count_Abundant_no = 0;
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("enter Sentinal Value");
        int a = keyBoard.nextInt();
        
 
        for (long i = 0; i <= a; i++) {
            long sum = proper_Divs_Sum(i);
            if (sum < i){
                count_Deficient_no++;
            	System.out.println(i + " is a deficient number");
            }
            else if (sum == i){
                count_Perfect_no++;
            	System.out.println(i + " is a perfect number");
            }
            else{
                count_Abundant_no++;
            	System.out.println(i + " is an abundant number");
                
            }
        }
        System.out.println("Number Counting [(integers) between 1 to " + a + "]: ");
        System.out.println("Deficient number: " + count_Deficient_no);
        System.out.println("Perfect number: " + count_Perfect_no);
        System.out.println("Abundant number: " + count_Abundant_no);
    }
     public static Long proper_Divs_Sum(long num) {
        return rangeClosed(1, (num + 1) / 2).filter(i -> num % i == 0 && num != i).sum();
    }
}
