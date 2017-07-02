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

  // @Test
  // public void price(){
  //   assertEquals(300, keyboard.getprice());
  // }

  // @Test
  // public void canplay(){
  //   assertEquals("plays Crockett's Theme in an 80's pre-set", keyboard.play());
  // }






}
