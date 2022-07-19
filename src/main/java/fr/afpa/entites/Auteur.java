package fr.afpa.entites;

public class Auteur {
    private String codeAuteur;
    private String nomAuteur;
    private String prenomAuteur;

    public String getCodeAuteur() {
        return codeAuteur;
    }

    public void setCodeAuteur(String codeAuteur) {
        this.codeAuteur = codeAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    public Auteur(String codeAuteur, String nomAuteur, String prenomAuteur) {
        this.codeAuteur = codeAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
    }

}
