package music_shop;

public abstract class Instruments{

  String brand;
  String colour;
  String type;
  String material;

  public Instruments(String brand) {
    this.brand = brand;
  }

  public String getBrand(){
    return this.brand;
  }

  public String getColour(){
    return this.colour;
  }

  public String getMaterial(){
    this.material = material;
  }

  public String getType(){
    this.type = type;
  }

}