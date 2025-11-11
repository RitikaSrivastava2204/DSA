public class Pin {
    public static void main(String[] args) {
        pin("", 4);
    }
    public static void pin(String pin, int length){
        if(pin.length() == length ){
            System.out.println(pin);
            return;
        }
        for(int i=0; i<10; i++){
            pin(pin+i, length);
        }
    }
}
