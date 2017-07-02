import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class SaxophoneTest {

  Saxophone saxophone;

  @Before

  public void before(){
    saxophone = new Saxophone("Selmer","Gold lacquer","Alto","Brass & Bronze",23,1349);
  }

  @Test
  public void hasBrand(){
    assertEquals("Selmer", saxophone.getBrand()); 
  }

  // @Test 
  // public void hasColour(){
  //   assertEquals("Black", keyboard.getColour());
  // }

  // @Test
  // public void hasType(){
  //   assertEquals("Dx7", keyboard.getType());
  // }

  // @Test
  // public void hasMaterial(){
  //   assertEquals("Hard Plastic", keyboard.getMaterial());
  // }

  // @Test
  // public void numberOfKeys(){
  //   assertEquals(61, keyboard.getnumberOfKeys());
  // }

  // @Test
  // public void price(){
  //   assertEquals(300, keyboard.getprice());
  // }

  // @Test
  // public void canplay(){
  //   assertEquals("plays Crockett's Theme in an 80's pre-set", keyboard.play());
  // }






}
