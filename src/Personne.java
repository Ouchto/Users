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


        System.out.print("Entrez le nom : ");
        String nom = input.nextLine();

        System.out.print("Entrez l'âge : ");
        int age = input.nextInt();

        System.out.print("Entrez le CIN : ");
        String cin = input.nextLine();

        System.out.print("Entrez l'email : ");
        String email = input.nextLine();

        System.out.print("Entrez le mot de passe : ");
        String password = input.nextLine();

        System.out.print("Entrez le rôle : ");
        String roleName = input.nextLine();

        Role role = new Role(roleName);
        Utilisateur newUtilisateur = new Utilisateur(nom, age, cin, password, email, role);
        users.add(newUtilisateur);

        System.out.println("Utilisateur ajouté avec succès !");
    }















}
