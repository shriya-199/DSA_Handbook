public class MissingNumberUsingXOR {
    public static void main(String[] args)
    {
        int[] arr ={1,2,5,4};
        int XOR = 0;
        int XOR2= 0;
        int n = 5-1;
        for(int i =0;i<n;i++)
        {
            XOR2 = XOR2^arr[i];
            XOR = XOR^(i+1);
        }
        XOR=XOR^5;

        System.out.print(XOR^XOR2);
    }
}
