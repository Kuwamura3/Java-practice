package practice;

import java.sql.SQLException;

public class Chapter10 {
	public static void main(String[] args) {
		
		try {
			int array[] = { 1, 3, 5 };
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 3);
			
			System.out.println("validIndex�̌ďo�I��");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException���������܂���");
			e.printStachTrace();
		}
		
		System.out.println("main���\�b�h�I��");
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQL�G���[�ł�");
	}
	
}
