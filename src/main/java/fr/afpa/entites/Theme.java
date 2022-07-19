package fr.afpa.entites;

public class Theme {
    private String codeTheme;
    private String theme;
    private String descripTheme;
    private int nbEmprunt;

    public Theme(String codeTheme, String theme, String descripTheme, int nbEmprunt) {
        this.codeTheme = codeTheme;
        this.theme = theme;
        this.descripTheme = descripTheme;
        this.nbEmprunt = nbEmprunt;
    }

    public int getNbEmprunt() {
        return nbEmprunt;
    }

    public void setNbEmprunt(int nbEmprunt) {
        this.nbEmprunt = nbEmprunt;
    }

    public String getCodeTheme() {
        return codeTheme;
    }

    public void setCodeTheme(String codeTheme) {
        this.codeTheme = codeTheme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescripTheme() {
        return descripTheme;
    }

    public void setDescripTheme(String descripTheme) {
        this.descripTheme = descripTheme;
    }

    @Override
    public String toString() {
        return String.format("code : %s %n theme : %s %n description : %s %n nbemprunt : %s %n", codeTheme, theme, descripTheme, nbEmprunt);
    }
}