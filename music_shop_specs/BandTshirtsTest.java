import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class BandTshirtsTest {

  BandTshirts bandTshirts;

  @Before

  public void before(){
  bandTshirts = new BandTshirts("Fender","Jimi Hendrix Electric Lady Land","m",8.00,18.00,10.00); 
  }

  @Test
  public void hasBrand(){
    assertEquals("Fender", bandTshirts.getBrand());  

  }

  // @Test
  // public void hasType(){
  //   assertEquals("Jimi Hendrix Electric Lady Land", guitarStrings.getType());
  // }

  // @Test
  // public void hasSize(){
  //   assertEquals('m',bandTshirts.getSize());
  // }

  // @Test
  // public void hasBuyingPrice(){
  //   assertEquals(8.00, guitarStrings.getbuyingPrice(),.01);
  // }

  // @Test
  // public void hasSellingPrice(){
  //   assertEquals(18.00, guitarStrings.getsellingPrice(),.01);
  // }

  // @Test 
  // public void hasCalculateMarkup(){
  //   assertEquals(10.00,guitarStrings.calculateMarkup(),.01);
  // }
}
