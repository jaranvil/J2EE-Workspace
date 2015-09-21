package edu.novascotia.training.model;

import java.util.List;


/**
 * General Course.
 * @author W0296430
 *
 */
public abstract class Course
{
    /**
     * default constructor.
     * @param name of course.
     */
    Course(final String name)
    {
        this.name = name;
    }
    /** Course Name.*/
    private String name;
    // list of students in course
    private List<Student> students;
    // list of assignments 
    private List<Assignment> assignments;

    /**
     * @return the name
     */
    protected final String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    protected final void setName(final String name)
    {
        this.name = name;
    }

	public List<Student> getStudents()
	{
		return students;
	}

	public void setStudents(List<Student> students)
	{
		this.students = students;
	}

	public List<Assignment> getAssignments()
	{
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments)
	{
		this.assignments = assignments;
	}

}
