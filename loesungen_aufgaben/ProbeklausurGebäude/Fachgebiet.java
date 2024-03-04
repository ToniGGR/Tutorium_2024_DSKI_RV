package ProbeklausurGebäude;

public enum Fachgebiet {
    ALLGEMEIN("Allgemein"),
    CHEMIE("Chemie"),
    MATHE("Mathe");
    private String description;

    Fachgebiet(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
