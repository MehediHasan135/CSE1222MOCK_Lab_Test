package Q1;

public class Runner1 {
    public static void main(String[] args) {
        Worker worker = new Worker("Noyon",25.00);
        Supervisor supervisor = new Supervisor("Turzo",50.00,"HR");
        Director director = new Director("Mehedi",100000.00,"CEO");
        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}
