public class stock {
    public static int maxprice(int[] price){
        int maxprice = 0;
        int buyprice = Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit = price[i]-buyprice;
                maxprice=Math.max(maxprice, profit);
            } else{
                buyprice=price[i];
            }
        }
        return maxprice;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,8,4};
        System.out.println(maxprice(price));
    }
}
