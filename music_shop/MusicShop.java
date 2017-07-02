package music_shop;
import behaviours.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MusicShop {

  String name;
  ArrayList<Sellable> shopInventory = new ArrayList<Sellable>();
  Sellable stock;

  public MusicShop(String name) {
    this.name = name;
    this.shopInventory = shopInventory;
    this.stock = stock;
  }

  public String getName(){
    return this.name;
  }

  public void addStock(Sellable stock) {
     this.shopInventory.add(stock);
  }

  public void removeStock(Sellable stock) {
    this.shopInventory.remove(stock);
  }

  public int stockCount() {
    return this.shopInventory.size();
  }
}