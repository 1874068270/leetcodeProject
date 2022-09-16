public class zhongweishu {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //System.out.println("ceshi ");
        int m=nums1.length;
        System.out.println("length of Nums1 :"+m);

        int n= nums2.length;
        System.out.println("length of Nums2 :"+n);
        int[] indexs = new int[2000];
        for(int i=0;i<2000;i++)
            indexs[i]=-1;
        int i=0,j=0,k=0;
        int zhongwei=(m+n)/2;
        if((m+n)==1)
        {
            if(m==0)
                return nums2[0];
            else
                return nums1[0];
        }


        for(;k<=zhongwei;k++)
        {
            if(i<m&&j<n)
            {
                if(nums1[i]>=nums2[j])
                {
                    indexs[k]=nums2[j];
                    j++;
                }
                else
                {
                    indexs[k]=nums1[i];
                    i++;
                }
            }
            else
            {
                if(m<n)
                {
                    indexs[k]=nums1[i];
                    i++;
                }
                else
                {
                    indexs[k]=nums2[j];
                    j++;
                }
            }


        }
        if((m+n)%2==0)
        {

            return (indexs[zhongwei]+indexs[zhongwei-1])/2.0;
        }
        else
        {

            return indexs[zhongwei];
        }


    }
    public static void main(String[] args) {
        //System.out.println("niubiya%d"+(2+2)%2);
        ListNode test;
        int[] a = new int[2];
        int[] b = new int[2];
        int[] c = new int[4];
        for(int i=0;i<2;i++)
            a[i]=2*i+1;
        System.out.println("length of a :"+a.length);
        for(int j=0;j<2;j++)
            b[j]=2*j;
        System.out.println("length of b :"+b.length);
        for(int k= 0;k<4;k++)
            c[k]=2*k;
        for(int i=0;i<5;i++)
        {
            //System.out.println(b[i]);
            //System.out.println(a[i]);

        }
        int[] arr1 = new int[]{0,0,0,0,0};
        int[] arr2 = new int[]{-1,0,0,0,0,0,1};



        System.out.println(findMedianSortedArrays(a,b));
        System.out.println(findMedianSortedArrays(a,c));
        System.out.println(findMedianSortedArrays(arr1,arr2));


    }
}
