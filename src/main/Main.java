package main;

import model.Student;
import service.StudentService;
import util.InputUtil;

public class Main
{
    public static void main(String[] args)
    {
        StudentService service = new StudentService();

        while(true)
        {
            System.out.println();
            System.out.println("===== Student Management System =====");
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Update Student Marks");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");

            System.out.print("Enter Choice : ");
            int choice = InputUtil.sc.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter ID : ");
                    int id = InputUtil.sc.nextInt();

                    InputUtil.sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = InputUtil.sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = InputUtil.sc.nextInt();

                    System.out.print("Enter Marks : ");
                    double marks = InputUtil.sc.nextDouble();

                    Student s = new Student(id,name,age,marks);

                    service.addStudent(s);

                    break;

                case 2:

                    service.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID : ");
                    id = InputUtil.sc.nextInt();

                    service.searchStudent(id);

                    break;

                case 4:

                    System.out.print("Enter Student ID : ");
                    id = InputUtil.sc.nextInt();

                    System.out.print("Enter New Marks : ");
                    marks = InputUtil.sc.nextDouble();

                    service.updateStudent(id,marks);

                    break;

                case 5:

                    System.out.print("Enter Student ID : ");
                    id = InputUtil.sc.nextInt();

                    service.deleteStudent(id);

                    break;

                case 6:

                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}