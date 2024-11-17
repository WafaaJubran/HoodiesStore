package hoodiesstore;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HoodiesStoreIT {

    public HoodiesStoreIT() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("after class");
    }

    @Before
    public void setUp() {
        System.out.println("before");
    }

    @After
    public void tearDown() {
        System.out.println("after");
    }

    @Test
    public void testcase1() {
        String expResult = "XS";
        String result = HoodiesStore.getSize(49, 54, 100);
        assertEquals(expResult, result);       
    }

    @Test
    public void testcase2() {
        String expResult = "S";
        String result = HoodiesStore.getSize(51, 54.5, 104);
        assertEquals(expResult, result);
    }

    @Test
    public void testcase3() {
        String expResult = "M";
        String result = HoodiesStore.getSize(53, 55, 108);
        assertEquals(expResult, result);
    }

    @Test
    public void testcase4() {
        String expResult = "Sorry; we don’t have that size";
        String result = HoodiesStore.getSize(55, 55.5, 118);
        assertEquals(expResult, result);
    }

    @Test
    public void testcase5() {
        String expResult = "XL";
        String result = HoodiesStore.getSize(61, 64, 118);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testcase6() {
        String expResult = "XXL";
        String result = HoodiesStore.getSize(64.5, 67.5, 123.5);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testcase7() {
        String expResult = "XXXL";
        String result = HoodiesStore.getSize(69, 72, 128);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testcase8() {
        String expResult = "XXXXL";
        String result = HoodiesStore.getSize(71.5, 73, 130.5);
        assertEquals(expResult, result);       
    }
}
