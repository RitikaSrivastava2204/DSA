public class RecursionWithArray {
    public static void main(String[] args) {
        int[] prices = {10,20,30,40};
        int[] newPrices = doubleThePrices(prices,0);
        for(int i =0; i< newPrices.length; i++){
            System.out.print(newPrices[i]+" ");
        }
    }
    public static int[] doubleThePrices(int prices[], int index){
        if(index == prices.length){
            return new int[prices.length];
        }
        int[] newPrices = doubleThePrices(prices, index+1);
        newPrices[index] = 2* prices[index];
        return newPrices;
    }
}
