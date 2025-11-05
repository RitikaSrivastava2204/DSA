public class SearchInArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,20,90,100,20};
        int search = 20;
        int count = countOcc(arr, 0, search);
        System.out.println("Count is "+ count);
    }
    static int countOcc(int arr[], int index, int search){
        if(index == arr.length){
            int count = 0;
            return count;
        }
        int smallCount = countOcc(arr,index+1, search);
        if(arr[index] ==  search){
            smallCount++;
        }
        return smallCount;

    }
}
