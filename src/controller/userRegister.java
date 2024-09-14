package controller;

import connection.bdConnection;
import model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userRegister {
    public boolean userAdd(user user) {
        String query = "INSERT INTO user (id, nanme, lastName, email, sanctions) VALUES (?, ?, ?, ?, ?)";

        try (Connection myConn = bdConnection.getConnection();
             PreparedStatement stmt = myConn.prepareStatement(query)) {

            stmt.setString(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getLastName());
            stmt.setString(4, user.getEmail());
            stmt.setInt(5, user.getSanctions());

            stmt.executeUpdate();

            stmt.close();
            myConn.close();

            return true;
        } catch (SQLException e) {
            System.out.println("SQL EXCEPTION: able to add the book" + e.getMessage());
            return false;
        }catch (Exception e) {
            System.out.println("Wasn't able to add the book" + e.getMessage());
            return false;
        }
    }

    public boolean userModify(user user) {
        String query = "UPDATE user SET name = ?, lastName = ?, email = ? WHERE id = ?";

        try (Connection myConn = bdConnection.getConnection();
             PreparedStatement stmt = myConn.prepareStatement(query)) {

            stmt.setString(1, user.getName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getEmail());

            stmt.executeUpdate();

            stmt.close();
            myConn.close();

            return true;
        } catch (SQLException e) {
            System.out.println("SQL EXCEPTION: able to add the book" + e.getMessage());
            return false;
        }catch (Exception e) {
            System.out.println("Wasn't able to modify the book" + e.getMessage());
            return false;
        }
    }

    public boolean userDelete(user user) {
        String query = "DELETE CASCADE FROM user  WHERE  id=?";

        try (Connection myConn = bdConnection.getConnection();

             PreparedStatement stmt = myConn.prepareStatement(query)) {

            stmt.setString(1, user.getId()); ;

            stmt.executeUpdate();

            stmt.close();
            myConn.close();
            return true;
        } catch (SQLException e) {
            System.out.println("SQL EXCEPTION: able to add the book" + e.getMessage());
            return false;
        }catch (Exception e) {
            System.out.println("Wasn't able to delete the book" + e.getMessage());
            return false;
        }
    }
}
