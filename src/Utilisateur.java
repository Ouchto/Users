public class Utilisateur extends Personne {
    private String userPassword;
    private String userEmail;
    private Role role;

    public Utilisateur(){ }

    public Utilisateur(String userNom, int userAge, String userCIN, String userPassword, String userEmail, Role role) {
        super(userNom, userAge, userCIN);
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.role = role;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "--------------------------\n"+
                "Nom :" + getUserNom() + "\n" +
                "Age :" + getUserAge() + "\n" +
                "CIN :" + getUserCIN() + "\n" +
                "Email :" + getUserEmail() + "\n" +
                "Role :" + getRole().getRoleName() ;
    }
}
