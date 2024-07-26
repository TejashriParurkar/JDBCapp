package com.nt;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.*;

public class Insert {
    int id;
    String name;
    int salary;

    public Insert(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void insertRecord() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=America/New_York", "root", "root_1234");
        PreparedStatement ps = con.prepareStatement("insert into emp values(2, 'Sam', 10000)");
//        ps.setInt(1, this.id);
//        ps.setString(2, this.name);
//        ps.setInt(3, this.salary)

        ps.execute();
        System.out.println("1 record added");
        con.close();
    }
}
