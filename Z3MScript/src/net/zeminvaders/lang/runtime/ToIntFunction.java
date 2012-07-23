package net.zeminvaders.lang.runtime;

import net.zeminvaders.lang.Interpreter;
import net.zeminvaders.lang.SourcePosition;


public class ToIntFunction extends Function
{

	@Override
	public int getParameterCount()
	{
		return 1;
	}

	@Override
	public String getParameterName(int index)
	{
		return "number";
	}

	@Override
	public ZemObject getDefaultValue(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ZemObject eval(Interpreter interpreter,SourcePosition pos)
	{
		ZemNumber n = (ZemNumber)interpreter.getVariable("number", pos);
        return new ZemNumber(n.longValue());
	}

	

}
