package Probeklausur;

public enum Fachgebiet {

GENERELL ("Generell"),
INFORMATIK ("Informatik"),
CHEMIE ("Chemie"),
MATHEMATIK ("Mathe");


private String description;

Fachgebiet (String desc){
    this.description = desc;
}
public String getDescription (){
    return this.description;
}   
}
