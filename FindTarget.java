public class FindTarget {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 8,9};
        int target = 4;
        for(int i : arr)
        {
            if(i == target)
            {
                System.out.print("Found");
            }
        }
        System.out.print("Not");
        
    }
}
