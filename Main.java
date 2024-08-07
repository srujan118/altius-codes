class Main
{
    public static void main(String[] args)
    {
       int n = sc.nextInt(); //taking length as a input
       int a[] = new int [n]; // array declaration
       for(int i=0;i<n;i++)
       {
        a[i] = sc.nextInt();
       }
       int k =sc.nextInt();
       reverse(a,n,0,n-k);
       reverse(a,n,n-k,n);
       reverse(a,n,0,n);
       for(int i=0;i<n;i++)
       {
        System.out.print(a[i]+" ");
       }
    }
    public static void reverse(int[] a,int n,int left,int right)
    {
        while(left<=right)
        {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}