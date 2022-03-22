package org.nerdcore.dungeonsanddragons5echaractersheet.service;

import java.sql.*;

public class SpellDatabaseService {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL= "jdbc:sqlite:src/main/resources/static/spellbookDatabase.db";

    public static void testConnect(){
        Connection conn = null;
        Statement stmt = null;
        String sql;
        try {
//            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, "sa", "");
            stmt = conn.createStatement();
            sql = "SELECT table_name FROM dba_tables";
            stmt.execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testConnect();
    }
}
