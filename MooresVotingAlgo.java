public class MooresVotingAlgo {
    public static void main(String[] args) {
        int cnt =0;
        int el = 0;
        int[] arr = {1, 1, 1, 1, 4, 2, 3, 1};
        for(int i =0;i<arr.length;i++)
        {
            if(cnt==0)
            {
                cnt =1;
                el = arr[i];
            }
            else if(arr[i]== el)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        int cnt1 =0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==el)
            {
                cnt1++;
            }
            if(cnt1>arr.length/2)
            {
                System.out.println("Majority Element: " + el);
                return;
            }
        }
        System.out.println("No Majority Element");
    }
}
