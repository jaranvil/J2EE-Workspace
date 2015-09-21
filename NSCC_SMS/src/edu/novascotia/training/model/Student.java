package edu.novascotia.training.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author W0296430
 * General Student
 */
public abstract class Student
{
    /**
     * default constructor.
     * @param name of student.
     * @param id of student.
     */
    Student(final String id, final String name)
    {
        this.name = name;
        this.id = id;
    }
    /** Courses that a student is enrolled to.*/
    private List<Course> courses;

    /** Student id.*/
    private String id;

    /** Student Name.*/
    private String name;

    /**
     * @return the name
     */
    public final String getName()
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
    /**
     * @return the id
     */
    final String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    final void setId(final String id)
    {
        this.id = id;
    }
    /**
     * @return String representation of a student.
     */
    public final String toString()
    {
        return getId() + " : " + getName();
    }
    /**
     * @param course new to enroll to.
     */
    public final void addCourse(final Course course)
    {
        getCourses().add(course);
    }


    /**
     * @return the courses
     */
    public final List<Course> getCourses()
    {
        if (courses == null)
        {
            courses = new ArrayList<Course>();
        }
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public final void setCourses(final List<Course> courses)
    {
        this.courses = courses;
    }
}
