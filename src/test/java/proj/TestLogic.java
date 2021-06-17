package proj;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogic {

	@Test
	public void testFindMax(){  
        assertEquals(4,Learning.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Learning.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  

}
