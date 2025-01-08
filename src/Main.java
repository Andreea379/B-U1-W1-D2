
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        stringaPariDispari("ciao");
        annoBisestile(2000);
        stampaLettere(5);
        suddivisioneStringa();
        contoAllaRovescia();
    }
    //es. 1 - if-else if
    public static void stringaPariDispari(String str){
        if(str.length() % 2 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    //es. 1 - anno bisestile
    public static void annoBisestile(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year %400 ==0){
            System.out.println("true");}}
        }else{
            System.out.println("false");
        }
    }
    // es. 2 - switch
    public static void stampaLettere( int num){
        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Error");
        }
    }
    //es. 3 - while
    public static void suddivisioneStringa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String str = scanner.nextLine();
        String word = printLetters(str);
        System.out.println(word);
    }

    public static String printLetters (String a){
        return String.join(", ", a.split(""));
    }

    //es. 4 - for
    public static void contoAllaRovescia(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int num = scanner.nextInt();
        for(int i = num; i > -1; i--){
            System.out.println(i);
        }
    }


}