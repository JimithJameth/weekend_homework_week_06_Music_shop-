import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;

public class GuitarStringsTest {

  GuitarStrings guitarStrings;

  @Before

  public void before(){
  guitarStrings = new GuitarStrings("Ernie Ball - Gaugues .010 - 0.46","Electric Guitar Strings",3.00,6.00) 
  }