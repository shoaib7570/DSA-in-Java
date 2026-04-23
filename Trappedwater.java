
public class Trappedwater {
    public static int Trapwatersum(int height[]){
        //leftmaxbondary
        int leftmax[]= new int [height.length];
        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        //rightmaxboundary
        int rightmax[] = new int [height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        //trapped water
        int trappedwater = 0;
        for(int i=0;i<height.length;i++){
            int waterlavel  = Math.min(leftmax[i], rightmax[i]);
            trappedwater+= (waterlavel-height[i]);
        }        
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {40,2,10,69,32,21,50};
        System.out.println(Trapwatersum(height));
    }
}
