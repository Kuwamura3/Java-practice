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
			e.printStackTrace();
		}
		
		try {
			Chapter10.throwSQLException();
		} catch (SQLException s) {
			System.out.println("SQLException���������܂���");
			s.printStackTrace();
		} finally {
			System.out.println("throwSQLException�̌ďo�I��");
		}
		
		System.out.println("main���\�b�h�I��");
	}
	
	public static void validIndex(int[] array, int a) {
		if ( array.length <= a ) {
			throw new IllegalArgumentException(a + "�̓T�C�Y�͈̔͊O�ł�");
		}
		System.out.println("�C���f�b�N�X" + a + "�̗v�f��" + array[a] + "�ł�");
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQL�G���[�ł�");
	}	
}
