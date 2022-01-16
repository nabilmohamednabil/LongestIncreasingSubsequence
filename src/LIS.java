import java.util.Random;

public class LIS {

	  static int lis(int arr[], int n)
		    {
		        int lis[] = new int[n];
		        int i, j, max = 0;
		 
		        /* Initialize LIS values for all indexes */
		        for (i = 0; i < n; i++)
		            lis[i] = 1;
		 
		        /* Compute optimized LIS values in
		           bottom up manner */
		        for (i = 1; i < n; i++)
		            for (j = 0; j < i; j++)
		                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
		                    lis[i] = lis[j] + 1;
		 
		        /* Pick maximum of all LIS values */
		        for (i = 0; i < n; i++)
		            if (max < lis[i])
		                max = lis[i];
		 
		        return max;
		    }
		 
		    public static void main(String args[])
		    {
		    	 Random y = new Random();
		    	 int max = 100 ;
		    	 int arr2[] = new int [100] ;
		    	 for(int x =0 ; x<= 99 ; x++){
		    		arr2[x] =  y.nextInt(max);		    	
		    	 }
		        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		        int n = arr2.length;
		        for(int xy : arr2) 
		        	System.out.println("array element " + xy  + "\n"); 
		        
		        System.out.println("Length of lis is " + lis(arr2, n) + "\n");
		    }


}
