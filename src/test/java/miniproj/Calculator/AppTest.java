package miniproj.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	App calci = new App();
	double delta=1e-15;
	/**
     * Rigorous Test :-)
     */
    @Test
    public void testRoot1()
    {
    	double cal_value=calci.root(25.0);
    	double exp_value=5.0;
    	assertEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testRoot2()
    {
    	double cal_value=calci.root(36.0);
    	double exp_value=5.0;
    	assertNotEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testFact1()
    {
    	double cal_value=calci.factorial(5);
    	double exp_value=120;
    	assertEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testFact2()
    {
    	double cal_value=calci.factorial(4);
    	double exp_value=20;
    	assertNotEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testpow1()
    {
    	double cal_value=calci.power(25.0,2);
    	double exp_value=625;
    	assertEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testpow2()
    {
    	double cal_value=calci.power(5,25.0);
    	double exp_value=5.0;
    	assertNotEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testlog1()
    {
    	double cal_value=calci.log(25.0);
    	double exp_value=3.2188758248682006;
    	assertEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
    @Test
    public void testlog2()
    {
    	double cal_value=calci.root(2.0);
    	double exp_value=5.0;
    	assertNotEquals(cal_value,exp_value,delta);
//        assertTrue( true );
    }
}
