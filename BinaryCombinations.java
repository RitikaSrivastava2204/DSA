public class BinaryCombinations {
    public static void main(String[] args) {
        printBinaryCombinations("",4);
    }
    public static void printBinaryCombinations(String result, int length){
        if(result.length()==length){
            System.out.println(result);
            return;
        }
        printBinaryCombinations(result+0, length);
        printBinaryCombinations(result+1, length);
    }
    
}