import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź dowolny tekst: ");
        String tekst = scanner.nextLine();

        StringBuilder zmienionyTekst = new StringBuilder();

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (Character.isUpperCase(znak)) {
                zmienionyTekst.append(Character.toLowerCase(znak));
            } else if (Character.isLowerCase(znak)) {
                zmienionyTekst.append(Character.toUpperCase(znak));
            } else {
                zmienionyTekst.append(znak); // Pozostawia spacje, cyfry i znaki specjalne
            }
        }

        System.out.println("Tekst po zamianie wielkości liter:");
        System.out.println(zmienionyTekst.toString());

        scanner.close();
    }
}

            
        
                