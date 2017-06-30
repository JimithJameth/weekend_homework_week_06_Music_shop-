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
}