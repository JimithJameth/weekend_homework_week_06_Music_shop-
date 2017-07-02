import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class SaxophoneTest {

  Saxophone saxophone;

  @Before

  public void before(){
    saxophone = new Saxophone("Selmer","Gold lacquer","Alto","Brass & Bronze",23,800.00,1349.00,549.00);
  }

  @Test
  public void hasBrand(){
    assertEquals("Selmer", saxophone.getBrand()); 
  }

  @Test 
  public void hasColour(){
    assertEquals("Gold lacquer", saxophone.getColour());
  }

  @Test
  public void hasType(){
    assertEquals("Alto", saxophone.getType());
  }

  @Test
  public void hasMaterial(){
    assertEquals("Brass & Bronze", saxophone.getMaterial());
  }

  @Test
  public void numberOfKeys(){
    assertEquals(23, saxophone.getnumberOfKeys());
  }

  @Test
  public void getbuyingPrice(){
    assertEquals(800 ,saxophone.getbuyingPrice(),.01);
  }

  @Test
  public void getsellingPrice(){
    assertEquals(1349 ,saxophone.getsellingPrice(),.01);
  }

  @Test
  public void canplay(){
    assertEquals("plays BakerStreet", saxophone.play());
  }
  @Test
  public void hasCalculateMarkup(){
      assertEquals(549,saxophone.calculateMarkup(),.01);
  }
}

