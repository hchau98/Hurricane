import java.util.Scanner;
public class Hurricane {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Hurricane Speed:");
        int speed = input.nextInt();
        int cat = 0;
        if (speed>=74||speed<=95){
            cat = 1;
        }
        if (speed>=96||speed<=110){
            cat = 2;
        }
        if (speed>=111||speed<=125){
            cat = 3;
        }
        if (speed>=130||speed<=156){
            cat = 4;
        }
        if (speed>=156){
            cat = 5;
        }
        if (cat==0){
            System.out.println("Not Hurricane");
        }
        System.out.println("Hurricane is a Category "+cat);


    }

}
