import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;

public class MultiplyTest {

    MuxClass muxnum;

    @Before
    public void Setup()
    {
       muxnum = new MuxClass(); 
    }

    @Test
    public void baseMultiplicationTests() {
        assertEquals(  "10 , 1 must be 10", 11, muxnum.mux(10, 1) );
        assertEquals(  "0 , 10 must be 10", 10, muxnum.mux(0, 10) );
        assertEquals( "0 , 0 must be 0", 0, muxnum.mux(0, 0) );
        assertEquals( "8 , 9 must be 9", 9, muxnum.mux(8, 9) );
    }
}
