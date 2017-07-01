package music_shop;
import behaviours.*;

public class GuitarStrings implements Sellable {

  double buyingPrice;
  double sellingPrice;
  double sell;

  public GuitarStrings(String brand ,String type, double buyingPrice, double sellingPrice){

    this.brand = brand;
    this.type = type;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

  public double getbuyingPrice(){
    return this.buyingPrice;
  }

  public double getsellingPrice(){
    return this.sellingPrice;
  }
  public String getBrand(){
    return this.getBrand;
  }
  public String getType(){
    return this.getType;
  }

  public double Sell(){
    return this.sell;
  }
}