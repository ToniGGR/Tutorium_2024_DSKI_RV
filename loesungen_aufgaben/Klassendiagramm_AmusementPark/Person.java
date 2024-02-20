package Klassendiagramm_AmusementPark;

public class Person {
    private String name;
    private double height;
    private int age;
    public Person (String name,double height, int age ){
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public double getHeight(){
        return this.height;
    }
    public int getAge(){
        return this.age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setAge(int age){
        this.age = age;
    }
}
