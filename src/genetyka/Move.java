package genetyka;

import java.util.Scanner;

/**
 * Created by Przykład Jan on 07.11.2017.
 */
public class Move {


    public static void Camp() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Droga jest zablokowana przez haszcze,");
                System.out.println("jedyna opcja na przedostanie sie dalej");
                System.out.println("to spalenie ich. Niestety nie posiadasz");
                System.out.println("zadnego przedmiotu ktory by to umozliwial,");
                System.out.println("wroc kiedy taki zdobedziesz.");
                Camp();

            case "idz na poludnie":
                System.out.println("Widzisz pobojowiski z setkami zwlok.");
                System.out.println("To tutaj stoczyla sie walka Twoich wrogow");
                System.out.println("i ludzi ktorzy Cie uwolnili.");
                Fild();

            case "idz na wschod":
                System.out.println("Podazajac na wschod widzisz duzy plac a na jego srodku studnie");
                Move.Well();

            case "idz na zachod":
                System.out.println("Wchodzisz na przepiekna lake, w oddali rozciagaja sie pasma gorskie.");
                Meadow(); //Tymczasowo

            case "przeszukaj oboz":
                System.out.println("Przeszukujesz oboz ale najwyrazniej najezdzcy wszystko zabrali.");
                Camp();

            case "idz spac":
                System.out.println("Spales wystarczajaca dlugo, czas rozpoczac swoja przygode.");
                Camp();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }
    }

    public static void Well() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Tam nic nie ma, mozesz jedynie zawrocic do obozowiska.");
                Well();

            case "idz na polodnie":
                System.out.println("Tam nic nie ma, mozesz jedynie zawrocic do obozowiska.");
                Well();

            case "idz na wschod":
                System.out.println("Tam nic nie ma, mozesz jedynie zawrocic do obozowiska.");
                Well();

            case "idz na zachod":
                System.out.println("Wracasz to zrujnowanego obozowiska.");
                Move.Camp();

            case "podejdz do studni":
                System.out.println("Podchodzisz do studni, widzisz stare wiaderko przymocowane lina do kolowrotka.");
                System.out.println("Na jedym z kamieni widzisz wyryta cyfre 2 ");
                Well();

            case "zagladnij do srodka":
                System.out.println("W ciemnosci studni widzisz maleniki blysk");
                System.out.println("");
                Well();

            case "nabierz wody":
                System.out.println("nabierasz wody w srodku wiaderka dostrzegasz klucz");
                Well();

            case "wez klucz":
                System.out.println("Zabierasz klucz");
                System.out.println("item + 1");
                Well();

            case "Zabierz wiaderko":
                System.out.println("Zabierasz wiaderko z woda");
                System.out.println("item + 1");
                Well();

            default:
                System.out.println("Co Ty odpierdalasz ?");
                Well();
        }
    }

    public static void Fild() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Wracasz do zrujnowanego obozowiska.");
                Move.Camp();

            case "idz na poludnie":
                System.out.println("Na połodnie od pobojowiska jest skarpa,");
                System.out.println("Jedyne co mozesz zrobic to z niej skoczyc");
                System.out.println("ale tego osobisicie nie doradzam.");
                Fild();

            case "idz na zachod":
                System.out.println("Tam nic nie ma, mozesz jedynie wrocic do obozowiska.");
                Camp();

            case "idz na wschod":
                System.out.println("Tam nic nie ma, mozesz jedynie wrocic do obozowiska.");
                Camp();

            case "przeszukaj zwloki":
                System.out.println("Przeszukujac zwloki natrafiasz na kilka mikstur leczniczych");
                System.out.println("|HP| Potion + 2");
                Camp();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }
    }

    public static void Meadow() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        switch (a) {
            case "idz na wschod":
                System.out.println("Wracasz sie do zrujnowanego obozowiska");
                Move.Camp();

            case "idz na poludnie":
                System.out.println("Tam nic nie ma, pozostan na tej drodze.");
                Meadow();

            case "idz na polnoc":
                System.out.println("Tam nic nie ma, pozostan na tej drodze.");
                Meadow(); //Pozniej sie zmieni na jakas jaskinie czy cus

            case "idz na zachod":
                System.out.println("Wchodzisz do starej jaskini, wyglada na opuszczana.");
                System.out.println("Miej się na bacznosci nigdy nie wiesz co moze Cie spotkac.");
                Move.Cave();

            case "zbieraj kwiatki":
                System.out.println("Andrzej co Ty pedal jestes ? #nohomo");
                Meadow();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Meadow();
        }
    }

    public static void Cave() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Na tym koniec");

        switch (a) {
            case "dasdasda":
                System.out.println("Wracasz sie do zrujnowanego obozowiska");
                Move.Camp();
        }
    }
}

