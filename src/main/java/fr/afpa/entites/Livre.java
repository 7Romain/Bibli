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

    public String getIsbnLivre() {
        return isbnLivre;
    }

    public void setIsbnLivre(String isbnLivre) {
        isbnLivre = isbnLivre;
    }

    public String getCodTheme() {
        return codTheme;
    }

    public void setCodTheme(String codTheme) {
        this.codTheme = codTheme;
    }

    public String getTitreLivre() {
        return titreLivre;
    }

    public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

}
