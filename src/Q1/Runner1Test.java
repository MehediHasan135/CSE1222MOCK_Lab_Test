package Q1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Runner1Test {
    @Test
    public void testWorker(){
        Worker worker = new Worker("Noyon",25.00);
        assertEquals("Worker[Name: Noyon, Wage: 25.0]",worker.toString());
    }
    @Test
    public void testSupervisor(){
        Supervisor supervisor = new Supervisor("Turzo",50.00, "HR");
        assertEquals("Supervisor[Name: Worker[Name: Turzo, Wage: 50.0],Division: HR]",supervisor.toString());
    }
    @Test
    public void testDirector(){
        Director director = new Director("Mehedi",100000.00,"CEO");
        assertEquals("Director[Name: Supervisor[Name: Worker[Name: Mehedi, Wage: 100000.0],Division: CEO]]",director.toString());
    }
}