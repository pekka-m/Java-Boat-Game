package game.test;

import game.movement.*;
import org.junit.*;
import static org.junit.Assert.*;

public class MovementTest {
    
    private double maxVelocity;
    private double xVelocity;
    private double yVelocity;
    private Location location;
    
    @Before
    public void runBeforeEachTest() {
        this.location = new Location(10, 10);
        this.maxVelocity = 123;
        this.xVelocity = 10;
        this.yVelocity = 10;
    }
    
    @Test
    public void testSomething() {
        double x = this.location.getX();
        double y = this.location.getY();
        
        x += this.xVelocity;
        y += this.yVelocity;
        
        this.location.setLocation(x, y);
        //return location;
    }
    
    @Test
    public void jokuJuupaJaapaTesti() {
        Movement movement = new Movement();
        movement.setVelocity(11);
        int imeparsaa = 10;
        assertEquals(11, movement.getVelocity(), movement.getVelocity());
    }
    
    @Test
    public void pinValueTest() {
        double value = 10;
        double max = 112;
        
        value = max;
    }
}
