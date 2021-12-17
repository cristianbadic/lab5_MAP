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
////        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "password1234");
////
////        String insertStud = "insert into students(idstudent) values(1), (2)";
////        Statement sta = con.createStatement();
////        sta.execute(insertStud);
//
//        TeacherMySQLRepository teachRep = new TeacherMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");
//
//        Teacher teacher1 = new Teacher("Dan", "Stan",1,new ArrayList<>());
//        Teacher teacher2 = new Teacher("Liviu", "Bran",2, new ArrayList<>());
//        Teacher teacher3 = new Teacher("Dan", "Stefan",3, new ArrayList<>());
//
////        teachRep.create(teacher1);
////        teachRep.create(teacher2);
////        teachRep.create(teacher3);
//
////       teachRep.delete(teacher1);
////       teachRep.delete(teacher2);
////        teachRep.delete(teacher3);
//
//
//
//        Teacher teacherUp = new Teacher("Dan2", "Stefan2",3, new ArrayList<>());
//       teachRep.update(teacherUp);
//
//        Student stud1= new Student("Bob", "Balint", 1, 0, new ArrayList<>());
//        Student stud2= new Student("Bill", "Burr", 2, 0, new ArrayList<>());
//        Student stud3= new Student("Constantin", "Dinescu", 3, 0, new ArrayList<>());
//
//        StudentMySQLRepository studentRep = new StudentMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");
////
////        studentRep.create(stud1);
////        studentRep.create(stud2);
////        studentRep.create(stud3);
//
////        studentRep.delete(stud1);
////        studentRep.delete(stud2);
////        studentRep.delete(stud3);
//
//
//
//        Course course1 = new Course(1, "Computer_Science", 1, 30, 6, new ArrayList<>());
//        Course course2 = new Course(2, "English", 2, 31, 6, new ArrayList<>());
//        Course course3 = new Course(3, "French", 3, 2, 15, new ArrayList<>());
//        Course course4 = new Course(4, "History", 3, 32, 6, new ArrayList<>());
//        Course course5 = new Course(5, "Spanish", 1, 4, 15, new ArrayList<>());
//
//        CourseMySQLRepository courseRep = new CourseMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");
////
////        courseRep.create(course1);
////        courseRep.create(course2);
////        courseRep.create(course3);
////        courseRep.create(course4);
////        courseRep.create(course5);
//
////       courseRep.delete(course1);
////        courseRep.delete(course2);
////        courseRep.delete(course3);
////        courseRep.delete(course4);
////        courseRep.delete(course5);
//
//        //for updating student
//        List<Long> list1 = new ArrayList<>();
//        list1.add(course3.getCourseId());
//        list1.add(course4.getCourseId());
//
//        List<Long> list2 = new ArrayList<>();
//        list2.add(course1.getCourseId());
//        list2.add(course3.getCourseId());
//
//
//        Student studUp1= new Student("Bill2", "Burr2", 2, 0, list1);
//        Student studUp2= new Student("Bob2", "Balint2", 1, 0, list2);
//        Student studUp3= new Student("Bob", "Balint", 1, 0, list1);
//        studentRep.update(studUp1);
//        studentRep.update(studUp2);
//        //studentRep.update(stud2);
//        //studentRep.update(studUp3);
//
//
//
//        List<Long> list3 = new ArrayList<>();
//        list3.add(stud3.getStudentId());
//
//        List<Long> list4 = new ArrayList<>();
//        list4.add(stud2.getStudentId());
//
//        List<Long> list5 = new ArrayList<>();
//        list5.add(stud3.getStudentId());
//
//        Course courseUp1 = new Course(5, "Spanish2", 1, 21, 1, list3);
//        Course courseUp2 = new Course(4, "History2", 3, 33, 10, list4);
//        Course courseUp3 = new Course(3, "French2", 3, 2, 14, list5);
//
//        //courseRep.update(courseUp1);
//
//        courseRep.update(course5);
//        courseRep.update(courseUp2);
//        //courseRep.update(courseUp3);
//
//        //courseRep.delete(courseUp3);
//        teachRep.delete(teacher3);
//
//        System.out.println(studentRep.getAll());
//        System.out.println(courseRep.getAll());
//        System.out.println(teachRep.getAll());

        TeacherMySQLRepository teachRep = new TeacherMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");
        StudentMySQLRepository studentRep = new StudentMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");
        CourseMySQLRepository courseRep = new CourseMySQLRepository("jdbc:mysql://localhost:3306/university", "root", "password1234");

        Controller contr = new Controller(courseRep, teachRep, studentRep);
        ConsoleView consoleV = new ConsoleView(contr);

        consoleV.run();
    }
}
