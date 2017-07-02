package music_shop;
import behaviours.*;

public class Guitar extends Instruments implements Playable,Sellable {

  int numberOfStrings;
  Double buyingPrice;
  Double sellingPrice;
  Double calculateMarkup;

  public Guitar(String brand,  String colour, String type, String material,int numberOfStrings, Double buyingprice, Double sellingPrice, Double calculateMarkup){
    super(brand, colour, type, material);
    this.numberOfStrings = numberOfStrings;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
    this.calculateMarkup = calculateMarkup;
  }

  public int getnumberOfStrings(){
    return this.numberOfStrings;
  }
  public String play(){
    return "weeedeedlelelelbrannngggeeeeee";
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
