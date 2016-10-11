/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc501_a1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vektor
 */
public class PersonTest {

    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person();
        String expResult = "Bob";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOfficeAreaCode method, of class Person.
     */
    @Test
    public void testGetOfficeAreaCode() {
        System.out.println("getOfficeAreaCode");
        Person instance = new Person();
        String expResult = "(403)";
        String result = instance.getOfficeAreaCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOfficeAreaCode method, of class Person.
     */
    @Test
    public void testSetOfficeAreaCode() {
        System.out.println("setOfficeAreaCode");
        String arg = "403";
        Person instance = new Person();
        instance.setOfficeAreaCode(arg);
    }

    /**
     * Test of getOfficeNumber method, of class Person.
     */
    @Test
    public void testGetOfficeNumber() {
        System.out.println("getOfficeNumber");
        Person instance = new Person();
        String expResult = "(403) 2071307";
        String result = instance.getOfficeNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOfficeNumber method, of class Person.
     */
    @Test
    public void testSetOfficeNumber() {
        System.out.println("setOfficeNumber");
        String arg = "(403)";
        Person instance = new Person();
        instance.setOfficeNumber(arg);
    }
    
}
