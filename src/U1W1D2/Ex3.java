package U1W1D2;

import java.util.Scanner;

public class Ex3 {
    Scanner sc = new Scanner(System.in);

    public void suddividiCaratteriDoWhile() {
        String str = "";
        do {
            System.out.print("Inserisci una stringa o :q per terminare: ");
            str = sc.nextLine();
            String[] car = str.split("");
            //System.out.println(Arrays.toString(car));
            String newString = String.join(",", car);
            System.out.println(newString);

        } while (!str.equals(":q"));
    }

    public void suddividiCaratteriWhile() {
        while (true){
            System.out.print("Inserisci una stringa o :q per terminare: ");
            String str = sc.nextLine();
            if(str.equals(":q")) {
                //break;
                return;
            }
            String[] car = str.split("");
            String newString = String.join(",", car);
            System.out.println(newString);
        }
    }
}
