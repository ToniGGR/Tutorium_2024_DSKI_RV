package Klassendiagramm_AmusementPark;
import java.util.ArrayList;
public class AmusementParkRide {
    private final String name;
    private double minimumHeight;
    private int visiotrs;
    private FunLevel funLevel;
    private ArrayList<Person> riding;
    public AmusementParkRide(String name, FunLevel funLevel){
        this.name = name;
        this.funLevel = funLevel;
        this.minimumHeight = 150;
        this.riding = new ArrayList<>();
    }
    public AmusementParkRide(String name, int minimumHeight, FunLevel funLevel){
        this.name=name;
        this.funLevel = funLevel;
        this.minimumHeight = minimumHeight;
        this.riding = new ArrayList<>();

    }
    public String getParkName(){
        return name;
    }
    public boolean isAllowedOn(Person person){
        if (person.getHeight() > this.minimumHeight){
            riding.add(person);
            visiotrs +=1;
            return true;

        }
        return false;
    }
    public void removeEveryoneOnRide(){
        riding.clear();
    }
    public double averageAgeOfPeropleOnRide(){
        double age = 0;

        for (Person r: this.riding){
            age += r.getAge();
        }
        return age/riding.size();
    }
    public String toString(){
        return "name" + this.name + " ( " +this.funLevel.getDescription()+ " ) " +" , mindest height " + this.minimumHeight + " , riding: " + riding.size();
    }

}
