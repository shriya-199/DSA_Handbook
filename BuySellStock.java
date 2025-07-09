public class BuySellStock {
    public static void main(String args[])
    {
        int[] arr = {1,3,5,8,10,2};
        int min = arr[0];
        int profit =0;
        for(int i =1;i<arr.length;i++)
        {
            int cost = arr[i]-min;
            profit = Math.max(cost,profit);
            min = Math.min(min,arr[i]);
        }
        System.out.print(profit);
    }
}
