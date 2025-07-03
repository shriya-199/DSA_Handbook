public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = arr.length;
        for(int i =1;i<n;i++)
        {
            int flag =0;
            for(int j =0;j<n-1;j++)
            {
                if(arr[j]==i)
                {
                    flag =1;
                    break;
                }
                
            }
                if(flag == 0)
                {
                    System.out.println("Missing number is: " + (i));
                    break;
                }
            }
        }
    }

// Time Complexity: O(n^2)