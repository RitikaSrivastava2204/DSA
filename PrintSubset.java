public class PrintSubset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println( subsets(arr,  0, 0));
    
    }
    public static int subsets(int[] arr,  int index, Integer count){
        if(index == arr.length){
            count += 1;
            return count;
        }
        return subsets(arr,  index+1, count) + subsets(arr,  index+1, count);

    }
}
