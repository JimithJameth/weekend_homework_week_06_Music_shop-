import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class GuitarTest {

  Guitar guitar;

  @Before

  public void before(){
    guitar = new Guitar("Fender","SeafoamGreen","Stratocaster","Alder",6,500.00,650.00,150.00);
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
  public void getbuyingPrice(){
    assertEquals(500 ,guitar.getbuyingPrice(),.01);
  }

  @Test
  public void getsellingPrice(){
    assertEquals(650 ,guitar.getsellingPrice(),.01);
  }
  @Test
  public void hasCalculateMarkup(){
    assertEquals(150,guitar.calculateMarkup(),.01);
  }
}