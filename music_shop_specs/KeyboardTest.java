import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class KeyboardTest {

  Keyboard keyboard;

  @Before

  public void before(){
    keyboard = new Keyboard("Yamaha","Black","Dx7","Hard Plastic",61,300);
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





}
