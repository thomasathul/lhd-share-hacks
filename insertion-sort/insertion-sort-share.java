import java.util.*;

class insertionsort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in list");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the list");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        insertionsortfunc(a,n);
         sc.close();
    }

    public static void insertionsortfunc(int[] a,int n)
    {
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            int curr=a[i];
            while(j>=0 && a[j]>curr)
            {
                 a[j+1]=a[j];

            j--;
            }
            a[j+1]=curr;
        }
        System.out.println(Arrays.toString(a));
    }

}