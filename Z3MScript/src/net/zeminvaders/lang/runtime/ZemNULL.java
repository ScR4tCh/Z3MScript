package net.zeminvaders.lang.runtime;

import net.zeminvaders.lang.Interpreter;

final public class ZemNULL extends ZemObject
{
    @Override
    public int hashCode()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "null";
    }

    @Override
    public boolean equals(Object object)
    {
        if(object==null || (object!=null && object instanceof ZemNULL))
        	return true;
        
        return false;
    }

	@Override
	public int compareTo(ZemObject arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
