package net.zeminvaders.lang.runtime;


/**
 * Special purpose "include" String for included script(s) content
 * @author scratch
 *
 */

final public class ZemIncludeString extends ZemObject
{
   private String value;

   public ZemIncludeString(String value)
   {
       this.value = value;
   }

   public ZemIncludeString concat(ZemIncludeString other)
   {
       return new ZemIncludeString(value + other.value);
   }

   @Override
   public String toString()
   {
       return value;
   }

   @Override
   public int compareTo(ZemObject object)
   {
       ZemIncludeString str = (ZemIncludeString) object;
       return value.compareTo(str.value);
   }

   @Override
   public int hashCode()
   {
       return value.hashCode();
   }

   @Override
   public boolean equals(Object object)
   {
       return compareTo((ZemObject) object) == 0;
   }
}
