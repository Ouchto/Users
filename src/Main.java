import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personne user = new Personne();

        int choix;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ajouter un utilisateur");
            System.out.println("2. Afficher tous les utilisateurs");
            System.out.println("3. Supprimer un utilisateur");
            System.out.println("4. Rechercher un utilisateur");
            System.out.println("5. Modifier un utilisateur");
            System.out.println("6. Quitter");
            System.out.print("Entrez votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choix) {
                case 1:
                    user.ajouterUtilisateur();
                    break;
                case 2:
                    user.afficherUtilisateurs();
                    break;
                case 3:
                    user.supprimerUtilisateur();
                    break;
                case 4:
                    user.rechercherUtilisateur();
                    break;
                case 5:
                    user.modifierUtilisateur();
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 6);

        scanner.close();
    }
}