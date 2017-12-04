package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {
    @Test
    public void testCheckBestSeller() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BestSeller= -1 ";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //when
        String sqlProcedureCall = "Call CheckBestseller()";
        statement.execute(sqlProcedureCall);
        //then
        String sqlCheckTable = "Select Count(*) AS HOW_MANY FROM BOOKS WHERE BestSeller= -1 ";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()) howMany = rs.getInt("How_MANY");
        Assert.assertEquals(0, howMany);
    }
}
