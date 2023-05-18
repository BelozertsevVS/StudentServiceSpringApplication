package com.ua.robot.repository;

import com.ua.robot.domain.Student;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentMysqlRepository implements StudentRepository {
    private static final String DB_URL = "jdbc:mysql://robot-do-user-1968994-0.b.db.ondigitalocean.com:25060/bielozertsev";
    private static final String DB_USER = "doadmin";
    private static final String DB_PASSWORD = "AVNS_I6wlDKjGszZn1wvLr9t";
    private static final String SELECT_FROM_STUDENT = "SELECT * FROM STUDENT";

    @Override
    public List<Student> findAll() {

        List<Student> result = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_FROM_STUDENT)) {
            while (rs.next()) {
                Student student = Student.builder()
                        .id(rs.getInt("ID"))
                        .surname(rs.getString("SURNAME"))
                        .age(rs.getInt("AGE"))
                        .groupID(rs.getString("GROUP_ID"))
                        .build();

                result.add(student);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

