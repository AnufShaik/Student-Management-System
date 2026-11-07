package service;

import java.util.ArrayList;
import model.Student;

public class StudentService
{
    ArrayList<Student> list = new ArrayList<Student>();

    public void addStudent(Student s)
    {
        list.add(s);
        System.out.println("Student Added Successfully");
    }

    public void displayStudents()
    {
        if(list.isEmpty())
        {
            System.out.println("No Students Found");
            return;
        }

        System.out.println("-------------------------------------");
        System.out.println("ID\tName\tAge\tMarks");
        System.out.println("-------------------------------------");

        for(Student s : list)
        {
            s.display();
        }
    }

    public void searchStudent(int id)
    {
        for(Student s : list)
        {
            if(s.getId()==id)
            {
                System.out.println("Student Found");
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public void updateStudent(int id,double marks)
    {
        for(Student s:list)
        {
            if(s.getId()==id)
            {
                s.setMarks(marks);
                System.out.println("Marks Updated");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public void deleteStudent(int id)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getId()==id)
            {
                list.remove(i);
                System.out.println("Student Deleted");
                return;
            }
        }

        System.out.println("Student Not Found");
    }
}
