package controller;

import model.book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.bdConnection;

public class bookRegister {
    public boolean bookAdd(book book) {
        String query = "INSERT INTO book (tittle, autor, isbn, editorial) VALUES (?, ?, ?, ?)";

        try (Connection myConn = bdConnection.getConnection();
             PreparedStatement stmt = myConn.prepareStatement(query)) {

            stmt.setString(1, book.getTittle());
            stmt.setString(2, book.getAutor());
            stmt.setString(3, book.getIsbn());
            stmt.setString(4, book.getEditorial());

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

    public boolean bookModify(book book) {
        String query = "UPDATE book SET tille=?, auto=?, isbn=?, editorial=? WHERE book_id=?";

        try (Connection myConn = bdConnection.getConnection();
             PreparedStatement stmt = myConn.prepareStatement(query)) {

            stmt.setString(1, book.getTittle());
            stmt.setString(2, book.getAutor());
            stmt.setString(3, book.getIsbn());
            stmt.setString(4, book.getEditorial());
            stmt.setInt(5, book.getId()) ;

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

    public boolean bookDelete(book book) {
        String query = "DELETE FROM book  WHERE  book_id=?";

        try (Connection myConn = bdConnection.getConnection();

             PreparedStatement stmt = myConn.prepareStatement(query)) {

            stmt.setInt(1, book.getId()) ;

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
