// KadanesAlgo mein ek int max lenge jo starting mein Integer.MIN_VALUE se initialize hoga.
// Phir hum array ke har element ko iterate karte hue, current sum ko update karenge.
// Agar current sum negative ho jata hai, to hum usay 0 set kar denge.
// Har iteration mein, hum max ko update karenge agar current sum max se bada ho.   
// Is tarah se hum maximum subarray sum ko find kar sakte hain.
public class KadanesAlgo {
    public static void main(String[] args) {
        long max = Long.MIN_VALUE;
        long sum =0;
        int[] arr = {-2,-2,-4,1,4,-1,1,5};
        for(int i =0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>max)
            {
                max = sum;
            }
            if(sum<0)
            {
                sum =0;
            }
        }   
        System.out.print(max);
    }
    
}
