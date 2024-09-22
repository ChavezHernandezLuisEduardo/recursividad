
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FactorialTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FactorialTest
{
    /**
     * Default constructor for test class FactorialTest
     */
    public FactorialTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

      @Test
    public void FactorialDe0()
    {
        Factorial factorial1 = new Factorial();
        assertEquals(0, factorial1.recursivo(0));
    }
  
    @Test
    public void FactorialDe1()
    {
        Factorial factorial1 = new Factorial();
        assertEquals(1, factorial1.recursivo(1));
    }

    @Test
    public void FactorialDe2()
    {
        Factorial factorial1 = new Factorial();
        assertEquals(2, factorial1.recursivo(2));
    }

    @Test
    public void FactorialDe3()
    {
        Factorial factorial1 = new Factorial();
        assertEquals(6, factorial1.recursivo(3));
    }

    @Test
    public void FactorialDe4()
    {
        Factorial factorial1 = new Factorial();
        assertEquals(24, factorial1.recursivo(4));
    }

}

