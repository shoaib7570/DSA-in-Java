public class pair {
    public static void pairs(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int curr = arr[i];
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print(curr +"," +arr[j]+" ");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,8,9};
        pairs(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr);
        }
    }
}