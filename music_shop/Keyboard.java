package music_shop;
import behaviours.*;

public class Keyboard extends Instruments implements Playable {

  int numberOfKeys;
  int price;

  public Keyboard(String brand,  String colour, String type, String material,int numberOfkeys, int price){
    super(brand, colour, type, material);
    this.numberOfKeys = numberOfKeys;
    this.price = price;
  }

  public int getnumberOfKeys(){
    return this.numberOfKeys;
  }
  public String play(){
    return "plays Crockett's Theme in an 80's pre-set";//ting na ning daaa ninggg daa ninggg//
  }

  public int getprice(){
    return this.price;
  }
}