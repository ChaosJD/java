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
  @Override publict int hashCode(){
    int result = 31 + age;
    result = 31* reuslt + name.hashCode();
    lont temp = Double.doubleToLongBits( weight );
    result = 31 * result + (int) (temp ^ ( temp >>> 32));
    
    return result;
  }
  
