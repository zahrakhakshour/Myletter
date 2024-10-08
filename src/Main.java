import Repository.StudentRepository;
import model.Student;

import java.sql.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        StudentRepository studentRepository = new StudentRepository();
        List<Student> students = studentRepository.getStudentByFirstName("zahra");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}