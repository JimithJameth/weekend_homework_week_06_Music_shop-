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
    musicShop = new MusicShop("The Musical Box");
    saxophone = new Saxophone("Selmer","Gold lacquer","Alto","Brass & Bronze",23,800.00,1349.00,549.00);
    guitar = new Guitar("Fender","SeafoamGreen","Stratocaster","Alder",6,500.00,650.00,150.00);
  }

  @Test
  public void musicShopName(){
    assertEquals("The Musical Box",musicShop.getName());
  }

  @Test
  public void addingStock() {
    shopInventory.addStock(guitar);
    assertEquals(1, shopInventory.stockCount());
  }

  @Test
  public void removeStock() {
    shopInventory.addStock(guitar);
    shopInventory.addStock(saxophone);
    shopInventory.addStock(bandTshirts);
    shopInventory.removeStock(guitar);
    assertEquals(2,shopInventory.stockCount());

  }
}
