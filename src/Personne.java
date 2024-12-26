import java.util.ArrayList;
import java.util.Scanner;

public class Personne {
    protected String userNom;
    protected int userAge;
    protected String userCIN;

    ArrayList<Utilisateur> users = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    // --------------------------------------------- les constracteurs ---------------------------------------------

    public Personne() {}

    public Personne(String userNom, int userAge, String userCIN) {
        this.userNom = userNom;
        this.userAge = userAge;
        this.userCIN = userCIN;
    }


    // --------------------------------------------- Les getters and setters ---------------------------------------------

    public String getUserNom() {
        return userNom;
    }

    public void setUserNom(String userNom) {
        this.userNom = userNom;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserCIN() {
        return userCIN;
    }

    public void setUserCIN(String userCIN) {
        this.userCIN = userCIN;
    }


    // --------------------------------------------- Les fonctions ---------------------------------------------

    //fonction pour ajouter un Utilisateur
    public void ajouterUtilisateur() {

        Utilisateur user = getAjouterUtilisateur();
        users.add(user);

        System.out.println("Utilisateur ajouté avec succès !");
    }

    private String  CIN( ){
        System.out.print("Entrez le CIN : ");
        String cin = input.next();
        for (Utilisateur utilisateur : users) {
            if (utilisateur.getUserCIN().equals(cin)) {
                System.out.println("CIN est existe déjà");
                cin = CIN();
            }else {
                break;
            }
        }
        return cin;
    }

    private Utilisateur getAjouterUtilisateur(){
        System.out.print("Entrez le nom : ");
        String nom = input.next();

        System.out.print("Entrez l'âge : ");
        int age = input.nextInt();

        String cin = CIN();

        System.out.print("Entrez l'email : ");
        String email = input.next();

        System.out.print("Entrez le mot de passe : ");
        String password = input.next();

        System.out.print("Entrez le rôle (Administrateur /Employé /Client) : ");
        String roleName = input.next();

        Role role = new Role(roleName);
        return new Utilisateur(nom, age, cin, password, email, role);
    }

    // Fonction pour afficher les utilisateurs
    public void afficherUtilisateurs() {
        if (users.isEmpty()) {
            System.out.println("Aucun utilisateur à afficher.");
            return;
        }

        for (Utilisateur utilisateur : users) {
            System.out.println(utilisateur);
        }
    }

    // Fonction pour Rechercher un utilisateur
    public void rechercherUtilisateur() {
        
        System.out.print("Entrez le CIN de l'utilisateur à rechercher : ");
        String cin = input.next();

        for (Utilisateur utilisateur : users) {
            if (utilisateur.getUserCIN().equals(cin)) {
                System.out.println(utilisateur);
                return;
            }
        }

        System.out.println("Utilisateur non trouvé.");
    }

    // Fonction pour modifier un utilisateur
    public void modifierUtilisateur() {
        System.out.print("Entrez le CIN de l'utilisateur à modifier : ");
        String cin = input.next();

        for (Utilisateur utilisateur : users) {
            if (utilisateur.getUserCIN().equals(cin)) {
                int choix;

                do {
                    System.out.println("1. Modifier le nom");
                    System.out.println("2. Modifier l'age");
                    System.out.println("3. Modifier l'email");
                    System.out.println("4. Modifier le Mot de passe");
                    System.out.println("5. Modifier le role");
                    System.out.println("6. Quitter");

                    System.out.print("Entre votre choix : ");
                    choix = input.nextInt();

                    switch (choix){
                        case 1:
                            System.out.print("Entrez le nouveau nom : ");
                            utilisateur.setUserNom(input.next());
                            break;
                        case 2:
                            System.out.print("Entrez le nouvel âge : ");
                            utilisateur.setUserAge(input.nextInt());
                            break;
                        case 3:
                            System.out.print("Entrez le nouvel email : ");
                            utilisateur.setUserEmail(input.next());
                            break;
                        case 4:
                            System.out.print("Entrez le nouveau mot de passe : ");
                            utilisateur.setUserPassword(input.next());
                            break;
                        case 5:
                            System.out.print("Entrez le nouveau rôle : ");
                            utilisateur.setRole(new Role(input.next()));
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("choix invalde");
                    }
                }while (choix != 6);
                System.out.println("Utilisateur modifié avec succès !");
                return;
            }
        }
        System.out.println("Utilisateur non trouvé.");
    }


    // Fonction pour supprimer un utilisateur
    public void supprimerUtilisateur() {
        System.out.print("Entrez le CIN de l'utilisateur à supprimer : ");
        String cin = input.nextLine();
        boolean supprimer = false;

        for (Utilisateur utilisateur : users) {
            if (utilisateur.getUserCIN().equals(cin)) {
                users.remove(utilisateur);
                System.out.println("Utilisateur supprimé avec succès !");
                supprimer = true;
                break;
            }
        }

        if (!supprimer ) {
            System.out.println("Utilisateur non trouvé.");
        }
    }
}
