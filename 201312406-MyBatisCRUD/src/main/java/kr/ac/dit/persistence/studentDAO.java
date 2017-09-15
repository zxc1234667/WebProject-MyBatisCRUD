package kr.ac.dit.persistence;

// studentVO를 import
import kr.ac.dit.domain.studentVO;

// interface = 추상 메소드 / C언어의 include와 동일
public interface studentDAO {
	
	//insertStudent = 
	public void insertStudent(studentVO item) throws Exception;
 
}