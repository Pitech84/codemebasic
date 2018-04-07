package pl.codeme.oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// rejestrujemy sie w sekcji static aby po pierwszym 
		// uruchomiu miec juz driver zainicjowany

		try {
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://devht.pl/codemesql", "codeme", "isshallpass!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
// przeniosem to do mavena bo nie dziala mysql w tym projekcie 
// patrz dalej w mavenie