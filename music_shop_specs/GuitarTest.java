import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class GuitarTest {

  Guitar guitar;

  @Before

  public void before(){
    guitar = new Guitar("Fender","SeafoamGreen","Stratocaster","Alder",6,500);
  }

  @Test
  public void hasBrand(){
    assertEquals("Fender", guitar.getBrand()); 
  }

  @Test 
  public void hasColour(){
    assertEquals("SeafoamGreen" , guitar.getColour());
  }

  @Test
  public void hasType(){
    assertEquals("Stratocaster" , guitar.getType());
  }

  @Test 
  public void hasMaterial(){
    assertEquals("Alder" , guitar.getMaterial());
  }

  @Test 
  public void canPlay(){
    assertEquals("weeedeedlelelelbrannngggeeeeee", guitar.play());
  }

  @Test
  public void numberOfStrings(){
    assertEquals(6 ,guitar.getnumberOfStrings());
  }

  @Test
  public void price(){
    assertEquals(500,guitar.getprice());
  }
  
}