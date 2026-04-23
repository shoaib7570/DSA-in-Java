
//     public static void maxsubarr(int arr[]){
//         int maxsum = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             int start=i;
//             for(int j=i;j<arr.length;j++){
//                 int end=j;
//                 int currsum = 0;
//                 for(int k=start;j<=end;k++){
//                      currsum += arr[k];
//                 }
//                 System.out.println(currsum);
//                 if(maxsum<currsum){
//                     maxsum=currsum;
//                 }
//             }
//         }
//         System.out.println(maxsum);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,3,-1,4,1,-5,7};
//          maxsubarr(arr);
//     }
// }
public class maxsubarray {

    public static void maxsubarr(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int currsum = 0;   // reset here

                // for (int k = i; k <= j; k++) {
                //     currsum += arr[k];
                currsum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
                System.out.println("Current Sum = " + currsum);

                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -1, 14, 10, -5, 7};
        maxsubarr(arr);
    }
}
