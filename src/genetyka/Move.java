package genetyka;

import java.util.Scanner;

/**
 * Created by Przykład Jan on 07.11.2017.
 */
public class Move {


    public static boolean Zamek() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();


        switch (a) {
            case "otworz drzwi":
                System.out.println("Drzwi sa zamkniete bedziesz potrzebowal klucza");
                return false;

            case "zapukaj":
                System.out.println("Nikt nie odpowiada");
                return false;

            case "wywarz drzwi":
                System.out.println("Jestes na to zbyt slaby...");
                return false;

            case "idz na wschod":
                Move.Studnia();
                return true;

            case "idz na zachod":
                System.out.println("napotykasz stary zaniedbany cmentarz");
                System.out.println("tu wbija nowa klasa");
                return false;

            case "idz na polnoc":
                System.out.println("debilu stoisz na wrost zamku");
                return false;

            case "zawroc":
                System.out.println("nie masz dokad wracac");
                return false;

            default:
                System.out.println("Co Ty odpierdalasz ?");
                return false;
        }
    }

    public static boolean Studnia() {
        System.out.println("Podazajac na wschod widzisz duzy plac a na jego srodku studnie");
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();



        switch (b) {
            case "podejdz":
                System.out.println("Podchodzisz do studni, widzisz stare wiaderko przymocowane lina do kolowrotka");
                return false;

            case "zagladnij do srodka":
                System.out.println("w ciemnosci studni widzisz maleniki blysk");
                return false;

            case "nabierz wody":
                System.out.println("nabierasz wody w srodku wiaderka dostrzegasz klucz");
                return false;

            case "idz na wschod":
                System.out.println("Widzisz stara studnie");
                System.out.println("tutaj wlatuje nowa klasa");
                return false;

            case "wez klucz":
                System.out.println("Zabierasz klucz");
                return false;

            case "wroc do zamku":
                System.out.println("Wracasz do zamku");
                Move.Zamek();
                return true;


            default:
                System.out.println("Co Ty odpierdalasz ?");
                return false;
        }
    }
}

