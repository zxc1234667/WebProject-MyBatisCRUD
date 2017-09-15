package kr.ac.dit;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.ac.dit.domain.studentVO;
import kr.ac.dit.persistence.studentDAO;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class studentDAOTest {
	
	 @Inject
	 private studentDAO studentDao;
	 
	 @Test
	 public void testInsert() throws Exception {
		 
		  studentVO item = new studentVO();
		  item.setNumber("201312406");
		  item.setName("MyBatisTest");
		  studentDao.insertStudent(item);
	  
	 }
	 
	 @Test
	 public void selectTest() throws Exception {
	 
	 }
}
