package music_shop;
import behaviours.*;

public class BandTshirts implements Sellable {

  String brand;
  String type;
  String size;
  Double buyingPrice;
  Double sellingPrice;
  Double calculateMarkup;


public BandTshirts (String brand ,String type, String size, Double buyingPrice, Double sellingPrice, Double calculateMarkup){

  this.brand = brand;
  this.type = type;
  this.size = size;
  this.buyingPrice = buyingPrice;
  this.sellingPrice = sellingPrice;
  this.calculateMarkup = calculateMarkup;
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

    public String getSize(){
      return this.size;
    }

    public Double calculateMarkup(){
     double markup = sellingPrice - buyingPrice;
      return markup; 
    }
  }