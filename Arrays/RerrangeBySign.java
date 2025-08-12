import java.util.*;
public class RerrangeBySign {
    public static void main(String[] args) {
        int[] arr={-3,-1,-2,-5,2,-4};
        int n = arr.length;
        /**Brute Force 
        int pIndx =0;
        int nIndx =0;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                negative[nIndx++]=arr[i];
            }
            if(arr[i]>=0)
            {
                positive[pIndx++]=arr[i];
            }
        }
        for(int i =0;i<n/2;i++)
        {
            arr[i*2]=positive[i];
            arr[i*2+1]=negative[i];
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }*/ 
        /**No.Of Positives and Negatives are Equal 
        int pos=0;
        int neg=1;
        int[] ans = new int[n];
        for(int i =0;i<n;i++)
        {
           if (arr[i] >= 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }*/
        int pIndx=0;
        int nIndx=0;
        int p[] = new int[n];
        int[] neg = new int[n];
        for(int i =0;i<n;i++)
        {
            if(arr[i]<0)
            {
                neg[nIndx++]=arr[i];
            }
            else
            {
                p[pIndx++]=arr[i];
            }
        }
        for(int i =0;i<Math.min(pIndx,nIndx);i++)
        {
            arr[2*i]=p[i];
            arr[2*i+1]=neg[i];
        }
        if(pIndx>nIndx)
        {
            for(int i =2*nIndx;i<n;i++)
            {
                arr[i]=p[i-nIndx];
            }
        }
        else
        {
            for(int i =2*pIndx;i<n;i++)
            {
                arr[i]=neg[i-pIndx];
            }
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        } 

    }
}
