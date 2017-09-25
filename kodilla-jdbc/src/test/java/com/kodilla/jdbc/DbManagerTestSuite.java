package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
       //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuerry =  "Select U.FIRSTNAME, U.LASTNAME, count(*) as POSTS_NUMBER\n" +
                "from POSTS P, USERS U\n" +
                "where U.ID = P.USER_ID\n" +
                "group by P.USER_ID\n" +
                "HAVING COUNT(*) >= 2;";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuerry);

        //then

        int counter = 0;
        while(resultSet.next()) {
            System.out.println(resultSet.getString("FIRSTNAME") + ", " +
                    resultSet.getString("LASTNAME"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(2, counter);

    }

    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }
}