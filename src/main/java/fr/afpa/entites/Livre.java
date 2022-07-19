package fr.afpa.entites;

public class Livre {
    private String isbnLivre;
    private String codTheme;
    private String titreLivre;
    private Auteur auteur;

    public Livre(String isbnLivre, String codTheme, String titreLivre, Auteur auteur) {
        this.isbnLivre = isbnLivre;
        this.codTheme = codTheme;
        this.titreLivre = titreLivre;
        this.auteur = auteur;
    }

    /**
     * @return String
     */
    public String getIsbnLivre() {
        return isbnLivre;
    }

    /**
     * @param isbnLivre
     */
    public void setIsbnLivre(String isbnLivre) {
        this.isbnLivre = isbnLivre;
    }

    /**
     * @return String
     */
    public String getCodTheme() {
        return codTheme;
    }

    /**
     * @param codTheme
     */
    public void setCodTheme(String codTheme) {
        this.codTheme = codTheme;
    }

    /**
     * @return String
     */
    public String getTitreLivre() {
        return titreLivre;
    }

    /**
     * @param titreLivre
     */
    public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

    /**
     * @return Auteur
     */
    public Auteur getAuteur() {
        return auteur;
    }

    /**
     * @param auteur
     */
    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

}
