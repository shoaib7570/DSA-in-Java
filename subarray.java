public class subarray{
    public static void subarr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int start=i;
            for(int j=i;j<=arr.length-1;j++){
                int end=j;
                int sum = 0;
                for(int k=start;k<=end;k++){
                    sum=sum + arr[k];
                    System.out.print(arr[k] + " "+"="+sum);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,6,8};
        subarr(arr);
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr);
        }
    }
}