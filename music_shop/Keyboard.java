package music_shop;
import behaviours.*;

public class Keyboard extends Instruments implements Playable {

  int numberOfKeys;
  Double buyingPrice;
  Double sellingPrice;
  Double calculateMarkup;

  public Keyboard(String brand,  String colour, String type, String material,int numberOfKeys, Double buyingPrice, Double sellingPrice){

    super(brand, colour, type, material);
    this.numberOfKeys = numberOfKeys;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

  public int getnumberOfKeys(){
    return this.numberOfKeys;
  }
  public String play(){
    return "plays Crockett's Theme in an 80's pre-set";//ting na ning daaa ninggg daa ninggg//
  }

  public Double getbuyingPrice(){
    return this.buyingPrice;
  }

  public Double getsellingPrice(){
    return this.sellingPrice;
  }

  public Double calculateMarkup(){
   double markup = sellingPrice - buyingPrice;
   return markup; 
 }
}