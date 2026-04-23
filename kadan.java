public class kadan{
    public static void kadanalgo(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;      //kadanalgorithm
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2,-3,5,-2,6,72,8};
        kadanalgo(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr);
        }
    }
}