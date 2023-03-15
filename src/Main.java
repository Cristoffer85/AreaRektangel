import java.util.Scanner;

            //--------------------------------
            // Scanner, en klass som används för att läsa in data från användaren
            // System.in, en inmatningsström som används för att läsa in data från användaren
            // nextLine(), en metod som läser in en rad från användaren
            // nextInt(), en metod som läser in ett heltal från användaren
            // -------------------------------
            // Instruktioner
            // Fråga användaren om rektangelns längd
            // Fråga användaren om rektangelns bredd
            // Beräkna rektangelns omkrets (2 _ längd + 2 _ bredd)
            // Beräkna rektangelns area (längd * bredd)
            //--------------------------------

public class Main {

    public static void main(String[] args) {

        // Deklarera
        int longside;
        int shortside;
        int circ;
        int area;

        // Hämta information ifrån användaren, scanner 1
        Scanner mScanner1 = new Scanner(System.in);
        System.out.println("Ange rektangelns långa sida: "); // Fråga användaren om rektangelns långa sida
        longside = mScanner1.nextInt();

        // Hämta information ifrån användaren, scanner 2
        Scanner mScanner2 = new Scanner(System.in);
        System.out.println("Ange rektangelns korta sida: "); // Fråga användaren om rektangelns korta sida
        shortside = mScanner2.nextInt();

        // Beräkna rektangelns omkrets och area
        circ = (longside * 2) + (shortside * 2); // Beräkna rektangelns omkrets (2 _ längd + 2 _ bredd)
        area = longside * shortside; // Beräkna rektangelns area (längd * bredd)

        // Skriv ut information på sidan
        System.out.println("Kvadratens omkrets är: " + circ);
        System.out.println("Kvadratens area är: " +area);



    }
}
