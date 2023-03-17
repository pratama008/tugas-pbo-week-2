import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ==================================OBJEK PERTAMA
        // MEMBUAT OBJEK
        var lampuBohlam = new Lampu();

        // AKSES ATRIBUT DAN METHOD
        System.out.print("Apakah lampu menyala? ");
        lampuBohlam.nyalakanLampu();

        System.out.println(" ");
        // ==================================OBJEK KEDUA
        // MEMBUAT OBJEK
        var lampuLED = new Lampu();

        // AKSES ATRIBUT DAN METHOD
        System.out.print("Apakah lampu menyala? ");
        lampuLED.matikanLampu();
    }
}