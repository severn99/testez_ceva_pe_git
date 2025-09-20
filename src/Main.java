
import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int c = input.nextInt();
        int s = 0;

        for(int i = 0; i < c; i++) {
            s = s + c;
        }

        System.out.println(s);

        input.close();

    }
}
