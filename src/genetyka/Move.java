package genetyka;

import java.util.Scanner;

/**
 * Created by Przykład Jan on 07.11.2017.
 */
public class Move {


    public static void Castle() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("debilu stoisz na wrost zamku");
                Castle();

            case "idz na poludnie":
                System.out.println("Wchodzisz do lasu");
                System.out.println("Co jakis czas widac dziwne migotanie swiatla w oddali");
                Forest();

            case "idz na wschod":
                System.out.println("Podazajac na wschod widzisz duzy plac a na jego srodku studnie");
                Move.Well();

            case "idz na zachod":
                System.out.println("napotykasz stary zaniedbany cmentarz");
                System.out.println("tu wbija nowa klasa");
                Castle(); //Tymczasowo

            case "otworz drzwi":
                System.out.println("Drzwi sa zamkniete bedziesz potrzebowal klucza");
                Castle();

            case "zapukaj":
                System.out.println("Nikt nie odpowiada");
                Castle();

            case "wywarz drzwi":
                System.out.println("Jestes na to zbyt slaby...");
                Castle();

            case "zawroc":
                System.out.println("nie masz dokad wracac");
                Castle();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Castle();
        }
    }

    public static void Well() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "podejdz":
                System.out.println("Podchodzisz do studni, widzisz stare wiaderko przymocowane lina do kolowrotka");
                Well();

            case "zagladnij do srodka":
                System.out.println("w ciemnosci studni widzisz maleniki blysk");
                Well();

            case "nabierz wody":
                System.out.println("nabierasz wody w srodku wiaderka dostrzegasz klucz");
                Well();

            case "idz na wschod":
                System.out.println("Widzisz stara studnie");
                System.out.println("tutaj wlatuje nowa klasa");
                Well(); //Tymczasowo

            case "wez klucz":
                System.out.println("Zabierasz klucz");
                Well();

            case "wroc do zamku":
                System.out.println("Wracasz do zamku");
                Move.Castle();

            default:
                System.out.println("Co Ty odpierdalasz ?");
                Well();
        }
    }

    public static void Forest(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Wracasz do zamku");
                Castle();

            case "idz na poludnie":
                System.out.println("Idziesz dalej w glab lasu");
                System.out.println("Kolejny raz widzisz dziwne migotajace swiatlo, ale tym razem wydaje Ci sie, ze jest blizej");
                DeeperInForest();

            case "idz na wschod":
                if (Random.RInt(1,10) == 5){
                    System.out.println("Zaatakowaly Cie dzikie zwierzeta w lesie, umierasz");
                    System.out.println("/* Poki co spieprzasz do zamku, bo dopiero gre piszemy */");
                    Move.Castle();
                }
                else{
                    System.out.println("Tam nic nie ma, zostaje na drodze");
                    Forest();
                }

            case "idz na zachod":
                System.out.println("Tam nic nie ma, zostaje na drodze");
                Forest();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Forest();
        }
    }

    public static void DeeperInForest(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a){
            case "idz na polnoc":
                System.out.println("Wracasz sie");
                Forest();

            case "idz na poludnie":
                System.out.println("Gdzie leziesz");
                DeeperInForest();

            case "idz na wschod":
                System.out.println("Wchodzisz do jaskini");
                DeeperInForest(); //Pozniej sie zmieni na jakas jaskinie czy cus

            case "idz na zachod":
                System.out.println("Widzisz jakiegos szwaba i go napierdalasz dildosem, ktorego wlasnie wyjales z tylka, podejrzane... #nohomo");
                DeeperInForest();

            case "szukaj":
                System.out.println("Chuja widzisz!");
                DeeperInForest();

            default:
                System.out.println("Co Ty odpierdalasz?");
                DeeperInForest();
        }
    }
}

