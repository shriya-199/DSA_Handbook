import java.util.*;
public class EuclideanAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1 = sc.nextInt();
        System.out.print("Enter n2:");
        int n2 = sc.nextInt();
        while(n1>0 && n2>0)
        {
            if(n1>n2) n1 = n1%n2;
            else n2 = n2%n1;
        }
        if(n1==0) System.out.print(n2);
        else System.out.print(n1);
    }
}
// Time Complexity : O(logx(min(n1,n2)))