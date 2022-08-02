public class Main {

    public static void main(String[] args) {

        int riga = 10;
        int num;
        int spazio;

        for(int i = 0; i < riga; i++) {
            for(spazio=riga; spazio>i; spazio--) {
                System.out.print(" ");
            }
            num = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(num+ " ");
                num = num*(i-j)/(j+1);
            }
            System.out.print("\n");
        }
    }
}