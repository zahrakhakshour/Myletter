package Repository;

import DB.Database;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static final String STUDENT_BY_FIRST_NAME = "select * from students where first_name =? ";

    public List <Student> getStudentByFirstName(String firstName) throws SQLException {
        Connection connection = Database.getConnection();
        PreparedStatement stm = connection.prepareStatement(STUDENT_BY_FIRST_NAME);
        stm.setString(1, firstName);
        ResultSet rs = stm.executeQuery();
        ArrayList<Student> students = new ArrayList<Student>();
        while (rs.next()) {
            Student student= new Student(
                    rs.getDate("dob") ,
                    rs.getString("first_name"),
                    rs.getFloat("gpu"),
                    rs.getString("last_name"),
                    rs.getString("national_code")

            );
            students.add(student);
        }
        return students;
    }



}
