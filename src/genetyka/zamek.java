package genetyka;

import java.util.Scanner;

/**
 * Created by Przykład Jan on 27.10.2017.
 */
public class zamek {

    public static void main(String[] args) {
        System.out.println("dasdasda");
        System.out.println("Witaj w Gothic 8 nie arkania");
        System.out.println("Znajdujesz sie przed zamkiem.");
        System.out.println("Na wprost Ciebie sa ogromne drzwi.");
        System.out.println("Co robisz ?");

        int studnia = Move.Run();

        if(studnia==0) {
            Move.Run();
        }
        if (studnia==1){
            System.out.println("chuj");
            Move.studnia();
        }
    }
}

    /*
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();


           switch (a) {

               case "otworz drzwi":
                   System.out.println("Drzwi sa zamkniete bedziesz potrzebowal klucza");
                   scanner.nextLine();
                   System.exit(1);
                   break;

               case "zapukaj":
                   System.out.println("Nikt nie odpowiada");
                   scanner.nextLine();
                   run();
                   break;
               case "wywarz drzwi":
                   System.out.println("Jestes na to zbyt slaby...");
                   scanner.nextLine();
                   break;
               case "idz na wschod":
                   System.out.println("Widzisz stara studnie");
                   System.out.println("tutaj wlatuje nowa klasa");
                   break;
               case "idz na zachod":
                   System.out.println("napotykasz stary zaniedbany cmentarz");
                   System.out.println("tu wbija nowa klasa");
                   break;
               case "idz na polnoc":
                   System.out.println("debilu stoisz na wrost zamku");
                   scanner.nextLine();
                   break;
               case "zawroc":
                   System.out.println("nie masz do kad wracac");
                   scanner.nextLine();
                   break;

               default:
                   System.out.println("Co Ty odpierdalasz ?");
                   scanner.nextLine();
                   break;
           }
       }
       */











