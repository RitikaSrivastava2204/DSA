public class SubSeq {
   public static void main(String[] args) {
    subSequence("amit", "");
   } 
   public static void subSequence(String str, String result){
    if(str.length()==0){
        System.out.println(result);
        return;
    }
   
    subSequence(str.substring(1), result + str.charAt(0));
    subSequence(str.substring(1), result);

   }
}
