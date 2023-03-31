// Interface for comparing objects, defined in java.lang
package java.lang;
java.lang.Comparable

public interface Comparable {
  public int compareTo(Object o);
}

public class String extends Object
  implements Comparable {
  // class body omitted
}

public class Date extends Object
  implements Comparable {
  // class body omitted
}

// Max.java: Find a maximum object
public class Max {
  /** Return the maximum of two objects */
  public static Comparable max
  ( Comparable o1, Comparable o2 ) {
  if (o1.compareTo(o2) > 0)
    return o1;
  else
    return o2;
  }
}

// Max.java: Find a maximum object
public class Max {
  /** Return the maximum of two objects */
  public static Object max
  ( Object o1, Object o2 ) {
  if (( (Comparable)o1 ).compareTo(o2) > 0)
    return o1;
  else
    return o2;
  }
}
