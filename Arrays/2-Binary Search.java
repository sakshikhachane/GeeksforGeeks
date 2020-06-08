// { Driver Code Starts
    import java.util.*;

    class BinarySearch
    {
         
         public static void main(String args[])
         {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T>0)
            {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                 
                int key =sc.nextInt();
                GfG g = new GfG();
                System.out.println(g.bin_search(arr,0,n-1,key));
            T--;
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class GfG
    {
        int bin_search(int A[], int l, int r,  int x)
        {
            if (r >= l) { 
                int mid = l + (r - l) / 2; 
      
                if (A[mid] == x) 
                    return mid; 
      
                if (A[mid] > x) 
                    return bin_search(A, l, mid - 1, x); 
      
                return bin_search(A, mid + 1, r, x); 
            } 
      
            return -1; 
            
        }
    }
    
    