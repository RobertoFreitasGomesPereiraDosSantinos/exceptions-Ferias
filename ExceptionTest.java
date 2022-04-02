package exeção;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionTest {
    public static void main(String... args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do catch 1");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dentro do catch 2");
        } catch (IllegalArgumentException e) {
            System.out.println("dentro do catch 3");
        }
        try {
            talvezExceptions();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("dentro do multi-catch");
        }
    }
    private static void talvezExceptions() throws SQLException, FileNotFoundException {

    }
}
