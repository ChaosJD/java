//Erzeugung durch Konstruktoren
Boolean b = new Boolean(true);
Character c = new Character('X');
Byte y = new Byte(1);
Short = s = new Short(2);
Integer i = new Integer(3);
Long = l = new Long(4);
Float f = new Float(3.12f);
Double d = new Double(3.14);

//Erzeugung mit valueOf
Long l1 = Long.valueOf(1000L);

//Erzeugung mit Boxing
Integer il = 42;

int i2 = 4711; // Boxing -> j = Integer.valueOf(i)

Integer j = i2; // Unboxing -> k = j.intValue()
int k = j;
