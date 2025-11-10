public class DiceGame {
    public static void main(String[] args) {
        diceGame(1,4,"");
    }
    public static void diceGame(int start, int end, String result){
        if(start==end+1){
            System.out.print(result + ", ");
            return;
        }
        if(start > end+1){
            return;
        }
        for(int i =1; i<=6; i++){
            diceGame(start+i, end, result + i);
        }

    }
}
