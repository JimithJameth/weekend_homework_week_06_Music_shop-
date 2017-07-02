package music_shop;
import behaviours.*;

public class Saxophone extends Instruments implements Playable {

  int numberOfKeys;
  int price;

  public Saxophone(String brand,  String colour, String type, String material,int numberOfKeys, int price){
    super(brand, colour, type, material);
    this.numberOfKeys = numberOfKeys;
    this.price = price;
  }

    public int getnumberOfKeys(){
      return this.numberOfKeys;
    }
    public String play(){
      return "plays BakerStreet";
    }

    public int getprice(){
      return this.price;
    }
  }