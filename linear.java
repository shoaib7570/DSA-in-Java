
public class linear {
    public static int linearsearch(int nums[],int key){
        int i;
        for (i=0; i<nums.length; i++){
            if (nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]= {2,4,6,8,10,12,14,16};
        int key=100;
        int index=linearsearch(nums,key);
        if (index==-1){
            System.out.println("element not found");
        } else{
            System.out.println("element found at index " +index );
        }
    }

}