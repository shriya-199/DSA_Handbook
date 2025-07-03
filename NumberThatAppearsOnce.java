public class NumberThatAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        for(int i =0;i<arr.length;i++)
        {
            int cnt =0;
            for(int j =0; j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    cnt++;
                }
            }
            if(cnt==1)
            {
                System.out.print(arr[i]);
                break; // Exit after finding the first unique number
            }
        }
    }
}
