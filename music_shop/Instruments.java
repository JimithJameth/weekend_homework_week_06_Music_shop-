package music_shop;

public abstract class Instruments{

  String brand;
  String colour;
  String type;
  String material;

  public Instruments(String brand, String colour, String type, String material) {
    this.brand = brand;
    this.colour = colour;
    this.type = type;
    this.material = material;
  }

  public String getBrand(){
    return this.brand;
  }

  public String getColour(){
    return this.colour;
  }

  public String getMaterial(){
    return this.material = material;
  }

  public String getType(){
    return this.type = type;
  }

}