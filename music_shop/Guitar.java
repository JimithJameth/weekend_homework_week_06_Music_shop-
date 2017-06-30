package music_shop;
import behaviours.*;

public class Guitar extends Instruments implements Playable {

  int numberOfStrings;

  public Guitar(String brand,  String colour, String type, String material,int numberOfStrings){
    super(brand, colour, type, material);
    this.numberOfStrings = numberOfStrings;
  }

  public int getnumberOfStrings(){
    return this.numberOfStrings;
  }
  public String play(){
    return "weeedeedlelelelbrannngggeeeeee";
  }
}
