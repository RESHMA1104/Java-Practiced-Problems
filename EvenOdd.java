public class EvenOdd {
    public static void main(String[] args) {
        for(int i=0;  i<=20; i++){
            if(i<10){
                if(i%2==0){
                    System.out.print(i +" ");
                }
            }
            if(i>10){
                if(i%2==1){
                    System.out.print(i-10 + " ");
                }
            }
        }
    }
}
