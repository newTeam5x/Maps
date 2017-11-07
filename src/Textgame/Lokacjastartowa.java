package Textgame;

import java.util.Scanner;

/**
 * Created by Przykład Jan on 07.11.2017.
 */
public class Lokacjastartowa {

    public static int Lokacja() {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "otworz drzwi":
                System.out.println("Drzwi sa zamkniete bedziesz potrzebowal klucza");
                return 0;

            case "zapukaj":
                System.out.println("Nikt nie odpowiada");
                return 0;

            case "wywarz drzwi":
                System.out.println("Jestes na to zbyt slaby...");
                return 0;

            case "idz na wschod":
                System.out.println("Widzisz stara studnie");
                System.out.println("tutaj wlatuje nowa klasa");
                return 1;

            case "idz na zachod":
                System.out.println("napotykasz stary zaniedbany cmentarz");
                System.out.println("tu wbija nowa klasa");
                return 2;

            case "idz na polnoc":
                System.out.println("debilu stoisz na wrost zamku");
                return 3;

            case "zawroc":
                System.out.println("nie masz dokad wracac");
                return 0;

            default:
                System.out.println("Co Ty odpierdalasz ?");
                return 0;
        }
    }
}