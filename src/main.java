import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Lüfen bir yıl giriniz : ");
        yil = input.nextInt();

        if (yil %4 == 0){
            System.out.println(yil + " Artık yıldır!.");
        } else {
            System.out.println(yil + " Artık yıl değildir");
        }
    }
}
