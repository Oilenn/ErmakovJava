import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Configuration
public class Main {
    public static void main(String[] args) throws SQLException {

        Connection source = DriverManager.getConnection("jdbc:h2./office");
    }
}