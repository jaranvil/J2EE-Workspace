package edu.novascotia.training.model;

import java.util.List;

/** @author W0296430 */
public abstract class Assignment
{
    /** Assignment Name. */
    private String name;

    /** Assignment Mark. */
    private Double mark;
    
  

    /** @return the name */
    protected final String getName()
    {
        return name;
    }

    /** @param name the name to set */
    protected final void setName(final String name)
    {
        this.name = name;
    }

	public Double getMark()
	{
		return mark;
	}

	public void setMark(Double mark)
	{
		this.mark = mark;
	}

}
