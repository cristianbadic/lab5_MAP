import ConsoleView.ConsoleView;
import Controller.Controller;
import Model.Course;
import Model.Student;
import Model.Teacher;
import Repository.CourseMySQLRepository;
import Repository.StudentMySQLRepository;
import Repository.TeacherMySQLRepository;
import Exception.DoesNotExistException;
import Exception.TeacherException;
import Exception.ExistentElementException;
import Exception.CanNotRegister;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arg) throws SQLException, DoesNotExistException, TeacherException, CanNotRegister, ExistentElementException, IOException {
        TeacherMySQLRepository teachRep = new TeacherMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");
        StudentMySQLRepository studentRep = new StudentMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");
        CourseMySQLRepository courseRep = new CourseMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");

        Controller contr = new Controller(courseRep, teachRep, studentRep);
        ConsoleView consoleV = new ConsoleView(contr);

        consoleV.run();
    }
}
