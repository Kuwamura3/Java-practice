package practice;

import java.sql.SQLException;

public class Chapter10 {
	public static void main(String[] args) {
		
		try {
			int array[] = { 1, 3, 5 };
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 3);
			
			System.out.println("validIndexの呼出終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStachTrace();
		}
		
		System.out.println("mainメソッド終了");
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
	
}
