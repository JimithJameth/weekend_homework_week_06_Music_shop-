package music_shop;
import behaviours.*;

public abstract class Guitar extends Instruments implements Playable {

  int numberOfStrings;

  public Guitar(String brand,  String colour, String type, int numberOfStrings){
    super(brand);
    super(colour);
    super(type);
    this.numberOfStrings = numberOfStrings;
  }

  public int getnumberOfStrings(){
    return this.numberOfStrings;
  }
  public String playable(){
    return "weeedeedlelelelbrannngggeeeeee";
  }
}
