import org.junit.* ;
import static org.junit.Assert.* ;
import java.util.*;

public class CircTest {
  LinkedList<String> l = new LinkedList<String>(); 
  
  @Before
  public void setUp() {
    l.add("joseph"); 
    l.add("brandon"); 
    l.add("juan"); 
    l.add("jose"); 
    l.add("peter"); 
    l.add("lolazo"); 
    l.add("holler"); 
    l.add("anthony"); 
    l.add("craig");
  }
  
  
  @Test
  public void testCirc1() {
    assertEquals("craig",CircList.remove(l,1)) ;
  }
  
  @Test
  public void testCirc2() {
    assertEquals("juan",CircList.remove(l,2)) ;
  }
  
  @Test
  public void testCirc3() {
    assertEquals("joseph",CircList.remove(l,3)) ;
  }

  
  @Test
  public void testInvalidList() {
    assertEquals(null,CircList.remove(null,1)) ;
  }
  
  
  @Test
  public void testInvalidRand() {
    assertEquals(null,CircList.remove(l,-1)) ;
  }
  
}