package music_shop;
import behaviours.*;
import java.util.ArrayList;


public class MusicShop {

 String name;
 ArrayList<Sellable> inventory;


 public MusicShop(String name) {
  this.name = name;
  this.inventory = new ArrayList<Sellable>();
}

public String getName(){
  return this.name;
}

public void addStock(Sellable stock) {
 inventory.add(stock);
}

public void removeStock(Sellable stock) {
  inventory.remove(stock);
}

public int stockCount() {
  return inventory.size();
}
}