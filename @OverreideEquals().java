class Person{
  

  public boolean euqals( Object obj){
    if (obj == null ){
     return false;
    }
  
   if (obj == this){
      return true;
    }
  
   //Teste ob gleicher Datentyp
    if(!this.getClass().equals(obj.getClass())){
     return false;
    }
  
    //Nur falls equals() in Oberklasse überschrieben wurde
    if(super.equals(obj) == false){
      return false;
    }
  
    //Vergleich der Datenelemente, abhängig von Anwendung
    Person other = (Person) obj; /// Typecast!
    if (this.name.equals(other.name) && this.age == other.age){
     return true;
    }
  
    return false;
  
  }
  
 public int hashCode(){
   int result = name.hashCode(); // all attributes
   resultt = 31 * result + ageM; // Primzahl, *31  schell zu implementieren.
   return result;
 }
  
}

  
