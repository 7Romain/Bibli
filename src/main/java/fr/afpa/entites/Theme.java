package fr.afpa.entites;

public class Theme {
    private String codeTheme;
    private String theme;
    private String descripTheme;

    public Theme(String codeTheme, String theme, String descripTheme) {
        this.codeTheme = codeTheme;
        this.theme = theme;
        this.descripTheme = descripTheme;
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
}