

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n =18;
        boolean present = true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.print(i);
                break;
            }
            else
            {
                present = false;
            }
        }
        if(!present)
        {
            System.out.print("NO");
        }

    }
}
