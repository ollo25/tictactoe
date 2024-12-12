import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        // VARIABLES
        Scanner sc = new Scanner(System.in);
        int numeroCaseJoue=0;
        int historiqueCaseUtilise=0;
        String dernierJoueur;
        boolean repetetion = true;

        // CODE
        System.out.print("Joueur 1 (la croix): ");
        String joueur1 = sc.nextLine();
        joueur1 = joueur1.trim();
        System.out.print("Joueur 2 (le rond): ");
        String joueur2 = sc.nextLine();
        char[][] tictactoe = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
        };
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("|");
                for (int k = 0; k <= 2; k++) {
                    System.out.print(tictactoe[j][k] + "|");
                }
                System.out.print("\n");
            }




            if (i % 2 == 1) {
                System.out.print("Ou veut tu mettre ta croix "+joueur1+": ");
                numeroCaseJoue = sc.nextInt();
                while (numeroCaseJoue < 1 || numeroCaseJoue > 9) {
                    System.out.println("Le nombre saisi n'est pas correct, veuillez saisir un chiffre compris entre 1 et 9");
                    System.out.print("Ou veut-tu mettre ton rond "+joueur2+": ");
                    numeroCaseJoue = sc.nextInt();
                }
                /*
                while (repetetion=true){
                    for (int j = 0; j <= 2; j++) {
                        for (int k = 0; k <= 2; k++) {
                            if (tictactoe[j][k] != 'O' && tictactoe[j][k] != 'X') {
                                System.out.println("Case deja complete, veuillez resaisir le numéro d'une case vierge");
                                numeroCaseJoue = sc.nextInt();
                            }
                        }
                        }
                    }
                */
                switch (numeroCaseJoue) {
                    case 1:
                        tictactoe[0][0] = 'X';
                        break;
                    case 2:
                        tictactoe[0][1] = 'X';
                        break;
                    case 3:
                        tictactoe[0][2] = 'X';
                        break;
                    case 4:
                        tictactoe[1][0] = 'X';
                        break;
                    case 5:
                        tictactoe[1][1] = 'X';
                        break;
                    case 6:
                        tictactoe[1][2] = 'X';
                        break;
                    case 7:
                        tictactoe[2][0] = 'X';
                        break;
                    case 8:
                        tictactoe[2][1] = 'X';
                        break;
                    case 9:
                        tictactoe[2][2] = 'X';
                        break;
                }
                dernierJoueur = joueur1;
            }
            else{
                System.out.print("Ou veut-tu mettre ton rond "+joueur2+": ");
                numeroCaseJoue = sc.nextInt();

                while (numeroCaseJoue < 1 || numeroCaseJoue > 9) {
                    System.out.println("Le nombre saisi n'est pas correct, veuillez saisir un chiffre compris entre 1 et 9");
                    System.out.print("Ou veut-tu mettre ton rond "+joueur2+": ");
                    numeroCaseJoue= sc.nextInt();
                }

                switch (numeroCaseJoue) {
                    case 1:
                        tictactoe[0][0] = 'O';
                        break;
                    case 2:
                        tictactoe[0][1] = 'O';
                        break;
                    case 3:
                        tictactoe[0][2] = 'O';
                        break;
                    case 4:
                        tictactoe[1][0] = 'O';
                        break;
                    case 5:
                        tictactoe[1][1] = 'O';
                        break;
                    case 6:
                        tictactoe[1][2] = 'O';
                        break;
                    case 7:
                        tictactoe[2][0] = 'O';
                        break;
                    case 8:
                        tictactoe[2][1] = 'O';
                        break;
                    case 9:
                        tictactoe[2][2] = 'O';
                        break;
                }
                dernierJoueur = joueur2;
            }

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            if ((tictactoe[0][0]=='X' && tictactoe[0][1]=='X' && tictactoe[0][2]=='X') ||(tictactoe[0][0]=='O' && tictactoe[0][1]=='O' && tictactoe[0][2]=='O')){
                System.out.println("Bien Joué "+dernierJoueur+", tu as gagné le tictactoe.");
            }
            if ((tictactoe[1][0]=='X' && tictactoe[1][1]=='X' && tictactoe[1][2]=='X') ||(tictactoe[0][0]=='O' && tictactoe[1][1]=='O' && tictactoe[1][2]=='O')){
                System.out.println("Bien Joué "+dernierJoueur+", tu as gagné le tictactoe.");
            }
            if ((tictactoe[2][0]=='X' && tictactoe[2][1]=='X' && tictactoe[2][2]=='X') ||(tictactoe[2][0]=='O' && tictactoe[2][1]=='O' && tictactoe[2][2]=='O')){
                System.out.println("Bien Joué "+dernierJoueur+", tu as gagné le tictactoe.");
            }
            if ((tictactoe[0][0]=='X' && tictactoe[1][0]=='X' && tictactoe[2][0]=='X') || (tictactoe[0][0]=='O' && tictactoe[1][0]=='O' && tictactoe[2][0]=='O')){
                System.out.println("Bien Joué "+dernierJoueur+", tu as gagné le tictactoe.");
            }
            if ((tictactoe[0][1]=='X' && tictactoe[1][1]=='X' && tictactoe[2][1]=='X') ||(tictactoe[0][1]=='O' && tictactoe[1][1]=='O' && tictactoe[2][1]=='O')){
                System.out.println("Bien Joué "+dernierJoueur+", tu as gagné le tictactoe.");
            }
            if ((tictactoe[0][2]=='X' && tictactoe[1][2]=='X' && tictactoe[2][2]=='X') ||(tictactoe[0][2]=='O' && tictactoe[1][2]=='O' && tictactoe[2][2]=='O')){
                System.out.println("Bien Joué "+dernierJoueur+", tu as gagné le tictactoe.");
            }
            if ((tictactoe[1][1]=='X' && tictactoe[2][2]=='X' && tictactoe[3][3]=='X') ||(tictactoe[0][0]=='O' && tictactoe[1][1]=='O' && tictactoe[2][2]=='O')){
                System.out.println("Bien Joué "+dernierJoueur+", tu as gagné le tictactoe.");
            }
            if ((tictactoe[2][0]=='X' && tictactoe[1][1]=='X' && tictactoe[0][2]=='X') ||(tictactoe[2][0]=='O' && tictactoe[1][1]=='O' && tictactoe[0][2]=='O')){
                System.out.println("Bien Joué "+dernierJoueur+", tu as gagné le tictactoe.");
            }
        }
    }
}