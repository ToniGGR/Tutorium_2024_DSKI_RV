package ProbeklausurGebäude;

public interface RaumInterface {
    public abstract boolean getIsBuchbar();
    public abstract void print_information();
    public void erhöheKosten(double betrag);
}
