public class BuySellStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,4,6};
        int profit=0;
        int min = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            int cost = arr[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,arr[i]);
        }
        System.out.print(profit);
    }
}
