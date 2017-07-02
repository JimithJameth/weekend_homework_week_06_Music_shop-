package music_shop;
import behaviours.*;

public class Saxophone extends Instruments implements Playable,Sellable {

  int numberOfKeys;
  Double buyingPrice;
  Double sellingPrice;
  Double calculateMarkup;

  public Saxophone(String brand,  String colour, String type, String material,int numberOfKeys, Double buyingPrice, Double sellingPrice, Double calculateMarkup){
    super(brand, colour, type, material);
    this.numberOfKeys = numberOfKeys;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

    public int getnumberOfKeys(){
      return this.numberOfKeys;
    }
    public String play(){
      return "plays BakerStreet";
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