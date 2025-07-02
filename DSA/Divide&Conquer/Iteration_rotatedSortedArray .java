public class Iteration_rotatedSortedArray  {
     public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int traget;
        int a[] = new int[n];
        System.out.println("Enter the values in an array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter your target value:");
        int target = s.nextInt();
        System.out.println("Entered values are:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Target value is:\n" + target);
//        System.out.println(ta)
        int value = Search1(a, 0, a.length - 1, target);
        System.out.println("Target found at:\n" + value);
    }

    public static int Search1(int a[], int si, int ei, int tar) 
    {
        //base case
//        if(si>ei)
//        {
//            return -1;
//        }
        while (si <= ei) 
        {
            int mid = si + (ei - si) / 2;
            if (a[mid] == tar) 
            {
                return mid;
            }
            //on line1
            if (a[si] <= a[mid]) 
            {
                //lef side of mid
                if (a[si] <= tar && tar <= a[mid]) 
                {
//                return Search1(a,si,mid-1,tar);
                    ei = mid - 1;
                } //right side of mid
                else 
                {
//                return Search1(a,mid+1,ei,tar);
                    si = mid + 1;
                }
            }
            else
            {
          //riht side of mid
                if(a[mid]<=tar && tar<=a[ei])
                {
//                return Search1(a,mid+1,ei,tar);
                    si=mid+1;
                }
                else
                {
                //left side of mid
//                return Search1(a,si,mid-1,tar);
                    ei=mid-1;
                }
            }

        }
        return -1;
    }
}
