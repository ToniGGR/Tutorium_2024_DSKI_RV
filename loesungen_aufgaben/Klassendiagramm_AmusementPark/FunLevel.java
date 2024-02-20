package Klassendiagramm_AmusementPark;

public enum FunLevel {
    BEGINNER("boring"), ADVANCED("alright"), PROFESSIONAL("awesome");
    private final String description;

    FunLevel(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
