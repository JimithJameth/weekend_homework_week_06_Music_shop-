package music_shop;
import behaviours.*;

public class GuitarStrings implements Sellable {
  
  String brand;
  String type;
  Double buyingPrice;
  Double sellingPrice;
  Double calculateMarkup;

  public GuitarStrings(String brand ,String type, Double buyingPrice, Double sellingPrice, Double calculateMarkup){

    this.brand = brand;
    this.type = type;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

  public Double getbuyingPrice(){
    return this.buyingPrice;
  }

  public Double getsellingPrice(){
    return this.sellingPrice;
  }
  public String getBrand(){
    return this.brand;
  }
  public String getType(){
    return this.type = type;
  }

  public Double calculateMarkup(){
   double markup = sellingPrice - buyingPrice;
    return markup; 
  }
}
  