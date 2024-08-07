class Kadane
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//length of the array
        // array declaration
        int a[] = new int [n];
        // input to the array
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = max_sum(a,n);
        System.out.println(sum);
    }
    public static int max_sum(int[] a,int n)
    {
        // handling edge cases
        if(n==0)    return -1;
        if(n==1)    return a[0];
        // intializing the sum variable 
        int maxi_sum = 0;
        for(int i=0;i<n;i++)
        {
            // adding the sum
            sum+=a[i];
            // checking for the max sum and updating the sum
            if(sum>maxi)    
            {
                maxi = sum;
            }
            // if sum<0 discontinuing the subarray and starting the new subarray 
            if(sum<0)   sum = 0;   
        }
        // finally returnning the sum
        return maxi_sum;

    }
}