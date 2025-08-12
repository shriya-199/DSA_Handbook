public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 2, 4, 4, 0, 1, 1,1};
        int n = arr.length;
        /**Brute Force 
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt > n / 2) {
                System.out.println(arr[i]);
                break;
            }
        }*/
        /**Moore's Voting Algo */
        int el=arr[0];
        int cnt=0;
        for(int i =1;i<n;i++)
        {
            if(cnt==0)
            {
                el=arr[i];
                cnt=1;
            }
            if(arr[i]==el)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        int cnt2=0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]==el)
            {
                cnt2++;
            }
        }
        if(cnt2>n/2)
        {
            System.out.print(el);
        }
        else
        {
            System.out.println("No");
        }
    }
}
