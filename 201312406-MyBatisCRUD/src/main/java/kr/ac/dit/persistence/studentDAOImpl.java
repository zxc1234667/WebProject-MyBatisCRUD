package kr.ac.dit.persistence;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import kr.ac.dit.domain.studentVO;

@Repository
public class studentDAOImpl implements studentDAO {
	//studentDAO를 실행시키면 실제로 이부분이 실행됨.
	
	@Inject SqlSession sqlSession;
	 
	@Override
	public void insertStudent(studentVO item) throws Exception {
		 
		sqlSession.insert("StudentMapper.insertStudent",item);
		 
	}
	 
}