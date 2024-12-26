public class Personne {
    protected String userNom;
    protected int userAge;
    protected String userCIN;


    public Personne() {}

    public Personne(String userNom, int userAge, String userCIN) {
        this.userNom = userNom;
        this.userAge = userAge;
        this.userCIN = userCIN;
    }


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
}
