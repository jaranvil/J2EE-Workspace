package edu.novascotia.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.novascotia.training.model.Course;
import edu.novascotia.training.model.Assignment;
import edu.novascotia.training.model.RegularAssignment;
import edu.novascotia.training.model.RegularCourse;
import edu.novascotia.training.model.RegularStudent;
import edu.novascotia.training.model.Student;
import edu.novascotia.training.utitlty.Configuration;
import edu.novascotia.training.utitlty.FileHandler;

/** load App info.
 * @author W0296430 */
public final class MarkAssignmentsMain
{
    /** list of students course assignments mark read; each per line. */
	protected static List<String>  list;
    /** list of students. */
    protected static List<Student> students = new ArrayList<Student>();

    /** prevent instantiation. */
    public MarkAssignmentsMain()
    {
    }

    /** Application entry point.
     * @param args application args.
     * @throws Exception where application throws error without catching it. */
    public static void main(final String[] args) throws Exception
    {
        MarkAssignmentsMain main = new MarkAssignmentsMain();
        if (args.length == 0)
        {
            main.displayHelp();
        }
        else
        {
            main.loadCourseMarks(FileHandler.loadConfig(Configuration.CONFIGURATION_FILE));
            switch (args[0])
            {
            case "1":
                main.printStudentsList();
                break;
            case "2":
                main.printStudentsGrades();
                break;
            default:
                break;
            }
        }

    }
    /** display help menu. */
    void displayHelp()
    {
        System.out.println("Please, supply the program with the suitable argument:");
        System.out.println("Enter \"1\" to display students info.");


    }

    /** @param lines data read from file.
     * @return list of students loaded from the file. */
    private List<Student> loadStudents(final List<String> lines)
    {
        for (String line : lines)
        {
            String[] data = line.split(":");
            Student student = new RegularStudent(data[0], data[1]);
            Course course = new RegularCourse(data[2]);
            
            List<Assignment> assignments = new ArrayList<Assignment>();
            for (int x = 3; x < data.length; x++) {
            	Assignment assignment = new RegularAssignment(data[2], Double.parseDouble(data[x]));
            	assignments.add(assignment);
            }            
            course.setAssignments(assignments);
            student.addCourse(course);
            students.add(student);
        }
        return students;
    }

    /** @param lines data read from file.
     * @return list of students loaded from the file.
     * @throws IOException when IO error occurs. */
    public List<Student> loadCourseMarks(final List<String> lines) throws IOException
    {
       for (String line : lines)
        {
            String[] data = line.split("=");
            if (data[0].toLowerCase().contains(Configuration.ASSIGNMENT_LITERAL))
            {
                loadStudents(FileHandler.loadConfig(data[1]));
            }

        }
        return students;
    }

    /** print list of students. */

    public void printStudentsList()
    {
        for (Student student : students)
        {
            System.out.println(student);

        }

    }

    public void printStudentsGrades()
    {
        for (Student student : students)
        {
            
            List<Course> courses = student.getCourses();
            
            for (int i = 0; i < courses.size(); i++) {
            	List<Assignment> assignments = courses.get(i).getAssignments();
            	double sum = 0;
            	for (int x = 0; x< assignments.size(); x++ ) {
            		sum = sum + assignments.get(x).getMark();
            		//System.out.println(assignments.get(x).getMark());
            	}
            	System.out.println(student.getName() + " " + sum);
            }

        }

    }
    
	public static List<String> getList()
	{
		return list;
	}

	public static void setList(List<String> list)
	{
		MarkAssignmentsMain.list = list;
	}

}
