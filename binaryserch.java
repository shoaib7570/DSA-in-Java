
public class binaryserch {
    public static int binariesserch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid  = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,15,67,69,72,43,234,423,432,435};
        int key = 435;
        System.out.println(binariesserch(arr, key));
    }    
}