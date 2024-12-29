import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean unique;
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

    }
}