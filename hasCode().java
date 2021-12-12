// Book example Java ist auch eine Insel
public class Player {
  
  String name;
  int age;
  double weight;
  
 
  /**
  * Returns a hash code value for this {@codePlayer} object.
  *
  * @return A hash code value for this object.
  *
  * @see java.lang.Object#equals(java.lang.Object)
  * @see java.util.HashMap
  */
  @Override public int hashCode(){
    int result = 31 + age;
    result = 31* reuslt + name.hashCode();
    lont temp = Double.doubleToLongBits( weight );
    result = 31 * result + (int) (temp ^ ( temp >>> 32));
    
    return result;
  }
}
  
//Script example:
//Muster zur Berechnung des Hashwertes, falls mehrere Attribute h1, h2, h3, ... ein Objekt identifizieren
  
@Override public int hashCode(){
  int result = h1.hashCode;
  result = 31* result * h2.hashCode();
  result = 31 * result + h3.hashCode();
}
