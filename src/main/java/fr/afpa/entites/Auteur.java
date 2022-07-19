package fr.afpa.entites;

public class Auteur {
    private String codeAuteur;
    private String nomAuteur;
    private String prenomAuteur;

    /**
     * @return String
     */
    public String getCodeAuteur() {
        return codeAuteur;
    }

    /**
     * @param codeAuteur
     */
    public void setCodeAuteur(String codeAuteur) {
        this.codeAuteur = codeAuteur;
    }

    /**
     * @return String
     */
    public String getNomAuteur() {
        return nomAuteur;
    }

    /**
     * @param nomAuteur
     */
    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    /**
     * @return String
     */
    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    /**
     * @param prenomAuteur
     */
    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    public Auteur(String codeAuteur, String nomAuteur, String prenomAuteur) {
        this.codeAuteur = codeAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
    }

}
