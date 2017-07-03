import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class GuitarStringsTest {

  GuitarStrings guitarStrings;

  @Before

  public void before(){
    guitarStrings = new GuitarStrings("Ernie Ball - Gaugues .010 - 0.46","Electric Guitar Strings",3.00,6.00,3.00); 
  }

  @Test
  public void hasBrand(){
    assertEquals("Ernie Ball - Gaugues .010 - 0.46", guitarStrings.getBrand());  

  }

  @Test
  public void hasType(){
    assertEquals("Electric Guitar Strings", guitarStrings.getType());
  }

  @Test
  public void hasBuyingPrice(){
    assertEquals(3.00, guitarStrings.getbuyingPrice(),.01);
  }

  @Test
  public void hasSellingPrice(){
    assertEquals(6.00, guitarStrings.getsellingPrice(),.01);
  }

  @Test 
  public void hasCalculateMarkup(){
    assertEquals(3.00,guitarStrings.calculateMarkup(),.01);
  }
}
