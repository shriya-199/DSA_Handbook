public class NumberThatAppearsOnceUsingXOR {
    public static void main(String[] args) {
        int arr[] ={1, 1, 2, 2, 3, 4, 4};
        int XOR =0;
        for(int i =0;i<arr.length;i++) {
            XOR ^= arr[i];
        }
        System.out.print(XOR);
    }
}
