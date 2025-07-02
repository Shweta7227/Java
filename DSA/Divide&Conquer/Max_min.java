public class Max_min {
     public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the elements in an array:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Result r=MaxMin(a,0,a.length-1);
        System.out.println("Maximum value is: "+r.max);
        System.out.println("Minimum value is: "+r.min);

    }
    public static Result MaxMin(int a[],int i,int j)
    {
       
        if(i==j)
        {
           return new Result(a[i],a[i]);
        }
        else if(i==j-1)
        {
            if(a[i]<a[j])
            {
                return new Result(a[j],a[i]);
                
            }
            else
            {
                return new Result(a[i],a[j]);

            }
        }
     
            int mid=(i+j)/2;
            Result left= MaxMin(a,i,mid);
            Result right= MaxMin(a,mid+1,j);
            int largest=Math.max(left.max,right.max);
            int smallest=Math.min(left.min,right.min);
            return new Result(largest,smallest);
    }
}
class Result
{
    int max,min;
    public Result(int max,int min)
    {
        this.max=max;
        this.min=min;
    }
        
}
