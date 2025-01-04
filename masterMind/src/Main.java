import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean unique;
        boolean victoire = false;
        boolean valide = false;
        String saisie;
        char[] chiffres = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] sequenceSecrete = new int[5];
        for (int i = 0; i < 5; i++) {
            do {
                unique = true;
                sequenceSecrete[i] = (int) (Math.random() * 9) + 1;
                for (int j = 0; j < i; j++) {
                    if (sequenceSecrete[i] == sequenceSecrete[j]) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
        }
        System.out.println("Bienvenue au jeu de MasterMind");
        System.out.println("Il faut deviner la séquence secrète composée de 5 chiffres de 1 à 9. Vous avez 12 tentatives.");
        for (int i = 1; i <= 12; i++) {
            System.out.println("Tentative " + i + ": Entrez une séquence de 5 chiffres : ");
            int[] proposition = new int[5];

            while (!valide) {
                saisie = scanner.next();
                if (saisie.length() != 5) {
                    System.out.print("Entrée invalide. Entrez exactement 5 chiffres entre 1 et 9 : ");
                } else {
                    valide = true;
                    for (int j = 0; j < 5; j++) {
                        char verification = saisie.charAt(j);
                        if (verification < '1' || verification > '9') {
                            valide = false;
                            break;
                        }
                        for (int a = 0; a < chiffres.length; a++) {
                            if (verification == chiffres[a]) {
                                proposition[j] = a + 1;
                                break;
                            }
                        }
                    }
                }
            }
            if (!valide) {
                System.out.print("Entrée invalide. Entrez exactement 5 chiffres entre 1 et 9 : ");
            }
            int bienPlaces = 0;
            for (int j = 0; j < 5; j++) {
                if (sequenceSecrete[j] == proposition[j]) {
                    bienPlaces++;
                }
            }
        }


    }
}