import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class KeyboardTest {

  Keyboard keyboard;

  @Before

  public void before(){
    keyboard = new Keyboard("Yamaha","Black","Dx7","Hard Plastic",61,300.00,450.00);
  }

  @Test
  public void hasBrand(){
    assertEquals("Yamaha", keyboard.getBrand()); 
  }

  @Test 
  public void hasColour(){
    assertEquals("Black", keyboard.getColour());
  }

  @Test
  public void hasType(){
    assertEquals("Dx7", keyboard.getType());
  }

  @Test
  public void hasMaterial(){
    assertEquals("Hard Plastic", keyboard.getMaterial());
  }

  @Test
  public void numberOfKeys(){
    assertEquals(61, keyboard.getnumberOfKeys());
  }
  @Test
  public void getbuyingPrice(){
    assertEquals(300 ,keyboard.getbuyingPrice(),.01);
    }
  @Test
  public void getsellingPrice(){
      assertEquals(450 ,keyboard.getsellingPrice(),.01);
    }
  @Test
  public void canplay(){
    assertEquals("plays Crockett's Theme in an 80's pre-set", keyboard.play());
  }

  @Test
  public void hasCalculateMarkup(){
    assertEquals(150,keyboard.calculateMarkup(),.01);
  }
}
