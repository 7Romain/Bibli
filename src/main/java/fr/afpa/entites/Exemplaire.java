package fr.afpa.entites;

public class Exemplaire {

    private String numExemplaire;
    private String codBibliotheque;
    private String codEmplacement;
    private String isbnLivre;
    private String codExemplaire;
    private boolean disponible;

    public Exemplaire(String numExemplaire, String codBibliotheque, String codEmplacement, String isbnLivre,
            String codExemplaire, boolean disponible) {
        this.numExemplaire = numExemplaire;
        this.codBibliotheque = codBibliotheque;
        this.codEmplacement = codEmplacement;
        this.isbnLivre = isbnLivre;
        this.codExemplaire = codExemplaire;
        this.disponible = disponible;
    }

    public String getNumExemplaire() {
        return numExemplaire;
    }

    public void setNumExemplaire(String numExemplaire) {
        this.numExemplaire = numExemplaire;
    }

    public String getCodBibliotheque() {
        return codBibliotheque;
    }

    public void setCodBibliotheque(String codBibliotheque) {
        this.codBibliotheque = codBibliotheque;
    }

    public String getCodEmplacement() {
        return codEmplacement;
    }

    public void setCodEmplacement(String codEmplacement) {
        this.codEmplacement = codEmplacement;
    }

    public String getisbnLivre() {
        return isbnLivre;
    }

    public void setIsbnLivre(String isbnLivre) {
        this.isbnLivre = isbnLivre;
    }

    public String getCodExemplaire() {
        return codExemplaire;
    }

    public void setCodExemplaire(String codExemplaire) {
        this.codExemplaire = codExemplaire;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
