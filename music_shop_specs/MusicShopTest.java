import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;

public class MusicShopTest {

 MusicShop musicShop;

 Sellable bandTshirts;
 Sellable saxophone;
 Sellable guitar;

 @Before

 public void before() {
  musicShop = new MusicShop("Ray's Music Exchange");
  saxophone = new Saxophone("Selmer","Gold lacquer","Alto","Brass & Bronze",23,800.00,1349.00,549.00);
  guitar = new Guitar("Fender","SeafoamGreen","Stratocaster","Alder",6,500.00,650.00,150.00);
}

@Test
public void musicShopName(){
  assertEquals("Ray's Music Exchange", musicShop.getName());
}

@Test
public void canAddStock() {
  musicShop.addStock(guitar);
  assertEquals(1, musicShop.stockCount());
}

@Test
public void canRemoveStock() {
  musicShop.addStock(guitar);
  musicShop.addStock(saxophone);
  musicShop.addStock(bandTshirts);
  musicShop.removeStock(guitar);
  assertEquals(2,musicShop.stockCount());

}
}
