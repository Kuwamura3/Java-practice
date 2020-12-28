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
			e.printStackTrace();
		}
		
		try {
			Chapter10.throwSQLException();
		} catch (SQLException s) {
			System.out.println("SQLExceptionが発生しました");
			s.printStackTrace();
		} finally {
			System.out.println("throwSQLExceptionの呼出終了");
		}
		
		System.out.println("mainメソッド終了");
	}
	
	public static void validIndex(int[] array, int a) {
		if ( array.length <= a ) {
			throw new IllegalArgumentException(a + "はサイズの範囲外です");
		}
		System.out.println("インデックス" + a + "の要素は" + array[a] + "です");
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}	
}
