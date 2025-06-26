import java.util.*;
public class ExtractionOfDigitsLeftToRight {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        String s1 = Integer.toString(n);
        for(int i =0;i<s1.length();i++)
        {
            System.out.print(s1.charAt(i)+" ");
        }
    }
}
