public class secondlargestelement {
    static int  getSecondlargest(int arr[]){
        int n=arr.length;
        int largest =-1;
        int second=-1;
        int index=0;
        //find first largest element
        for (int i=0; i<n;i++){
            if (arr[i]> largest){
                //second=first;
                largest =arr[i];
            }
        }
        System.out.println ("first largest number is "+ largest);

        //second largest element
        for (int i=0;i<n; i++){
            //if(arr[i]<larget&&arr[i]>second)
            if (arr[i]>second&& arr[i]!= largest){
                second=arr[i];
                index=i;
            }

        }
        System.out.println ("index number "+index );
        return second;



    }
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};
        int s=getSecondlargest (arr);
        System.out.println ("second largest number is "+s );

    }
}
