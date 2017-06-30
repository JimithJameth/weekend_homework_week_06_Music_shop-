import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class GuitarTest {

  Guitar guitar;

  @Before

  public void before(){
    guitar = new Guitar("Fender","SeafoamGreen","Stratocaster",6);
  }

  @Test
  public void hasBrand(){
    assertEquals("Fender", guitar.getBrand()); 
  }
}