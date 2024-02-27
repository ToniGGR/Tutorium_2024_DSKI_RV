package Klassendiagramm_Hotel;

public enum AccomodationCategory {
    SPA("spa", 1),
    FAMILY("family", 2),
    ADVENTURE("adventure", 3),
    BUSINESS("business", 4),
    CAMPING("camping", 5);
    private String description;
    private int points;
    AccomodationCategory(String description, int points){
        this.description=description;
        this.points=points;
    }
    public String getDescription(){
        return this.description;
    }
    public int getPoints() {
        return this.points;
    }


}
