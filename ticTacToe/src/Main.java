import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String nomA;
        int choixLigne;
        int choixColonne;
        String nomB;
        String remplacer;
        Boolean relancer = true;
        System.out.println();
        System.out.println("Bonjour, bienvenue dans le jeu tic tac toe");
        System.out.print("Première joueur veuillez saisir votre nom : ");
        nomA = clavier.nextLine();
        System.out.print("Bien, maintenant joueur 2 saisisez votre nom : ");
        nomB = clavier.nextLine();
        System.out.println("Joueur 1 : "+nomA);
        System.out.println("Joueur 2 : "+nomB);
        while(relancer == true){
            char[][] grille = {
                    {' ',' ',' '},
                    {' ',' ',' '},
                    {' ',' ',' '},
            };
            for (int i = 0;i < grille.length; i++) {
                System.out.println();
                for (int j = 0;j < grille[i].length;j++) {
                    System.out.print(grille[i][j]+"|");
                }
            }
            while(relancer == true){
                System.out.println();
                System.out.println(nomA+" ou voulez-vous mettre votre croix");
                System.out.print("quel ligne : ");
                choixLigne = nombre();
                while(choixLigne != 1 && choixLigne != 2 && choixLigne != 3){
                    System.out.println("saisir 1 ou 2 ou 3");
                    choixLigne = nombre();
                }
                choixLigne = choixLigne - 1;
                System.out.print("quel colonne : ");
                choixColonne = nombre();
                while(choixColonne != 1 && choixColonne != 2 && choixColonne != 3){
                    System.out.println("saisir 1 ou 2 ou 3");
                    choixColonne = nombre();
                }
                choixColonne = choixColonne - 1;
                while (grille[choixLigne][choixColonne] == 'X' || grille[choixLigne][choixColonne] == 'O'){
                    System.out.println("erreur, cette case est deja prise");
                    System.out.print("resaisir ligne : ");
                    choixLigne = nombre();
                    choixLigne = choixLigne - 1;
                    System.out.print("resaisir colonne : ");
                    choixColonne = nombre();
                    choixColonne = choixColonne - 1;
                }
                grille[choixLigne][choixColonne] = 'X';
                for (int i = 0;i < grille.length;i++){
                    System.out.println();
                    for (int j = 0;j < grille.length;j++){
                        System.out.print(grille[i][j]+"|");
                    }
                }
                if (grille[0][0] == 'X' && grille[0][1] == 'X' && grille[0][2] == 'X'){
                    System.out.println();
                    System.out.println("Bravo, "+nomA+" vous avez gagner la partie");
                    break;
                } else if (grille[1][0] == 'X' && grille[1][1] == 'X' && grille[1][2] == 'X') {
                    System.out.println();
                    System.out.println("Bravo, "+nomA+" vous avez gagner la partie");
                    break;
                }else if (grille[2][0] == 'X' && grille[2][1] == 'X' && grille[2][2] == 'X') {
                    System.out.println();
                    System.out.println("Bravo, "+nomA+" vous avez gagner la partie");
                    break;
                }else if (grille[0][0] == 'X' && grille[1][1] == 'X' && grille[2][2] == 'X') {
                    System.out.println();
                    System.out.println("Bravo, "+nomA+" vous avez gagner la partie");
                    break;
                }else if (grille[0][2] == 'X' && grille[1][1] == 'X' && grille[2][0] == 'X') {
                    System.out.println();
                    System.out.println("Bravo, "+nomA+" vous avez gagner la partie");
                    break;
                }else if (grille[0][0] == 'X' && grille[1][0] == 'X' && grille[2][0] == 'X') {
                    System.out.println();
                    System.out.println("Bravo, "+nomA+" vous avez gagner la partie");
                    break;
                }else if (grille[0][1] == 'X' && grille[1][1] == 'X' && grille[2][1] == 'X') {
                    System.out.println();
                    System.out.println("Bravo, "+nomA+" vous avez gagner la partie");
                    break;
                }else if (grille[0][2] == 'X' && grille[1][2] == 'X' && grille[2][2] == 'X') {
                    System.out.println();
                    System.out.println("Bravo, "+nomA+" vous avez gagner la partie");
                    break;
                }
                System.out.println();
                System.out.println(nomB+" ou voulez-vous mettre votre rond");
                System.out.print("quel ligne : ");
                choixLigne = nombre();
                while(choixLigne != 1 && choixLigne != 2 && choixLigne != 3){
                    System.out.println("saisir 1 ou 2 ou 3");
                    choixLigne = nombre();

                }
                choixLigne = choixLigne - 1;
                System.out.print("quel colonne : ");
                choixColonne = nombre();
                while(choixColonne != 1 && choixColonne != 2 && choixColonne != 3){
                    System.out.println("saisir 1 ou 2 ou 3");
                    choixColonne = nombre();
                }
                choixColonne = choixColonne - 1;
                while (grille[choixLigne][choixColonne] == 'X' || grille[choixLigne][choixColonne] == 'O'){
                    System.out.println("erreur, cette case est deja prise");
                    System.out.print("resaisir ligne : ");
                    choixLigne = nombre();
                    choixLigne = choixLigne - 1;
                    System.out.print("resaisir colonne : ");
                    choixColonne = nombre();
                    choixColonne = choixColonne - 1;
                }
                grille[choixLigne][choixColonne] = 'O';
                for (int i = 0;i < grille.length;i++){
                    System.out.println();
                    for (int j = 0;j < grille.length;j++){
                        System.out.print(grille[i][j]+"|");
                    }
                }
                System.out.println();
                if (grille[0][0] == 'O' && grille[0][1] == 'O' && grille[0][2] == 'O'){
                    System.out.println();
                    System.out.println("Bravo, "+nomB+" vous avez gagner la partie");
                    break;
                } else if (grille[1][0] == 'O' && grille[1][1] == 'O' && grille[1][2] == 'O') {
                    System.out.println();
                    System.out.println("Bravo, "+nomB+" vous avez gagner la partie");
                    break;
                }else if (grille[2][0] == 'O' && grille[2][1] == 'O' && grille[2][2] == 'O') {
                    System.out.println();
                    System.out.println("Bravo, "+nomB+" vous avez gagner la partie");
                    break;
                }else if (grille[0][0] == 'O' && grille[1][1] == 'O' && grille[2][2] == 'O') {
                    System.out.println();
                    System.out.println("Bravo, "+nomB+" vous avez gagner la partie");
                    break;
                }else if (grille[0][2] == 'O' && grille[1][1] == 'O' && grille[2][0] == 'O') {
                    System.out.println();
                    System.out.println("Bravo, "+nomB+" vous avez gagner la partie");
                    break;
                }else if (grille[0][0] == 'O' && grille[1][0] == 'O' && grille[2][0] == 'O') {
                    System.out.println();
                    System.out.println("Bravo, "+nomB+" vous avez gagner la partie");
                    break;
                }else if (grille[0][1] == 'O' && grille[1][1] == 'O' && grille[2][1] == 'O') {
                    System.out.println();
                    System.out.println("Bravo, "+nomB+" vous avez gagner la partie");
                    break;
                }else if (grille[0][2] == 'O' && grille[1][2] == 'O' && grille[2][2] == 'O') {
                    System.out.println();
                    System.out.println("Bravo, "+nomB+" vous avez gagner la partie");
                    break;
                }
            }
            System.out.println("Souhaitez vous relancer ?(o/n)");
            String reponse = clavier.nextLine().toUpperCase();
            while (!reponse.equals("OUI")&&!reponse.equals("O")&&!reponse.equals("NON")&&!reponse.equals("N")){
                System.out.println("Repondre par oui ou o/non ou n");
                reponse = clavier.nextLine();
            }
            if (reponse.equals("OUI")||reponse.equals("O")){
                relancer = true;
                remplacer = nomA;
                nomA = nomB;
                nomB = remplacer;
            }else {
                relancer = false;
            }
        }

    }



    public static int nombre(){
        Scanner clavier = new Scanner(System.in);
        while (!clavier.hasNextInt()){
            System.out.println("Saisir un chiffre !");
            clavier.nextLine();
            System.out.println("Resaisir le chiffre");
        }
        return clavier.nextInt();
    }
}