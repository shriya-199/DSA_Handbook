public class RearragngeBySignTwo {
    public static void main(String[] args) {
        int[] arr = {1, -2, -8, -7, 1, -25};
        int[] positive = new int[arr.length];
        int[] negative = new int[arr.length];
        int posIndx = 0;
        int negIndx = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<0) negative[negIndx++] = arr[i];
            else positive[posIndx++] = arr[i];
        }
        int i =0;
        int minCount = Math.min(posIndx,negIndx);
        for(;i<minCount;i++)
        {
            arr[2*i]=positive[i];
            arr[2*i+1]=negative[i];
        }

        int indx = 2*i;
        while(i<posIndx)
        {
            arr[indx++]=positive[i++];
        }
        while(i<negIndx)
        {
            arr[indx++]=negative[i++];
        }
        for(int val : arr)
        {
            System.out.print(val+" ");
        }
    }
}
