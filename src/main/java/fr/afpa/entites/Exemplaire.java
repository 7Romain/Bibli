package fr.afpa.entites;

public class Exemplaire {

    private String titre;
    private String codBibliotheque;
    private String codEmplacement;
    private String isbnLivre;
    private String codExemplaire;
    private String disponible;
    private String dateRetour;

    public String getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(String dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Exemplaire(String titre, String codBibliotheque, String codEmplacement, String isbnLivre,
            String codExemplaire, String disponible, String dateRetour) {
        this.titre = titre;
        this.codBibliotheque = codBibliotheque;
        this.codEmplacement = codEmplacement;
        this.isbnLivre = isbnLivre;
        this.codExemplaire = codExemplaire;
        this.disponible = disponible;
        this.dateRetour = dateRetour;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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

    public String isDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Exemplaire [codBibliotheque=" + codBibliotheque + ", codEmplacement=" + codEmplacement
                + ", codExemplaire=" + codExemplaire + ", disponible=" + disponible + ", isbnLivre=" + isbnLivre
                + ", titre=" + titre + "]";
    }

}
