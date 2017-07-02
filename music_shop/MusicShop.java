package music_shop;
import behaviours.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MusicShop {

  private String name;
  private ArrayList<Sellable>stock;


  public MusicShop(String name) {
    this.name = name;
    this.inventory = new ArrayList<Sellable>();
  }

  public String getName(){
    return this.name;
  }

  public void addStock(Sellable stock) {
     this.inventory.add(stock);
  }

  public void removeStock(Sellable stock) {
    this.inventory.remove(stock);
  }

  public int stockCount() {
    return this.inventory.size();
  }
}