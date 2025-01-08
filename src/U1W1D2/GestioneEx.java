package U1W1D2;
//import Ex1;
//import Ex2;
//import Ex3;
//import Ex4;

import java.util.Scanner;

public class GestioneEx {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        boolean stringaPariDispari= ex1.stringaPariDispari("Epicode");
        System.out.println(stringaPariDispari);

        boolean annoBisestile = ex1.annoBisestile(2023);

        Ex2 ex2 = new Ex2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int num = sc.nextInt();
        ex2.stampaLettere(num);

        Ex3 ex3 = new Ex3();
        ex3.suddividiCaratteriWhile();

        Ex4 ex4 = new Ex4();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Inserisci a number: ");
        int num1 = scanner.nextInt();
        ex4.contoAllaRovescia(num1);
    }

}
