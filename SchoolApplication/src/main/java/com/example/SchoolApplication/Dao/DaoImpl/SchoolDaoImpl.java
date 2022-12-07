package com.example.SchoolApplication.Dao.DaoImpl;

import java.net.URI;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.SchoolApplication.CustomExce.IdNotFoundException;
import com.example.SchoolApplication.Dao.SchoolDao;
import com.example.SchoolApplication.view.P_SchoolView;

@Repository
public class SchoolDaoImpl implements SchoolDao{
	  @Autowired
      JdbcTemplate jdbctemplate;
      
	@Override
	public List<P_SchoolView> getStudents() {
	     List<P_SchoolView> listStud=new ArrayList<P_SchoolView>();
	     P_SchoolView p_SchoolView=new P_SchoolView();
		String sql="select * from P_School";
	  List<Map<String,Object>> list=jdbctemplate.queryForList(sql);
	  for(Map map: list)
	  {
		  p_SchoolView.setRollNo(Integer.parseInt(map.get("RollNo").toString()));
		  p_SchoolView.setStud_Name(map.get("Stud_Name").toString());
		  p_SchoolView.setFather_Name(map.get("Father_Name").toString());
		  p_SchoolView.setMother_Name(map.get("Mother_Name").toString());
		  Date date=(Date)map.get("Birth_Date");
		  p_SchoolView.setBirth_Date(date.toLocalDate());
//		  p_SchoolView.setBirth_Date(((LocalDate)map.get("Birth_Date")));
		  p_SchoolView.setStandard((int)map.get("Standard"));
		  p_SchoolView.setAge((int)(map.get("age")));
		  p_SchoolView.setCreated_On((LocalDateTime)map.get("Created_On"));
		  p_SchoolView.setModified_On((LocalDateTime)map.get("modified_On"));
		  Date date_a=(Date)map.get("Admission_date");
		  p_SchoolView.setAdmission_date(date_a.toLocalDate());
		  p_SchoolView.setFees((int)map.get("Fees"));
		  listStud.add(p_SchoolView);
	  }
	  return listStud;
	}

	@Override
	public ResponseEntity<P_SchoolView> saveStudent(P_SchoolView p_SchoolView) {
		String query="insert into P_School values(?,?,?,?,?,?,?,?,?,?,?)";
		//java.sql.Timestamp timestamp = new java.sql.Timestamp(cal.getTimeInMillis());
		Calendar cal = Calendar.getInstance(); 
		java.sql.Timestamp timestamp = new Timestamp(cal.getTimeInMillis());
		int i=jdbctemplate.update(query, new Object[] {p_SchoolView.getRollNo(),p_SchoolView.getStud_Name(),
				p_SchoolView.getFather_Name(),p_SchoolView.getMother_Name(),p_SchoolView.getBirth_Date(),p_SchoolView.getStandard(),
				p_SchoolView.getAge(),LocalDateTime.now(),LocalDateTime.now(),p_SchoolView.getAdmission_date(),p_SchoolView.getFees()});
		
		 URI location=ServletUriComponentsBuilder
				 .fromHttpUrl("http://localhost:8889/SchoolApp/GetStudent")
				 .path("/{ID}")
				 .buildAndExpand(p_SchoolView.getRollNo()).toUri();
		 
		 return ResponseEntity.created(location).build();
		
	}

	@Override
	public Integer updateStudent(P_SchoolView p_SchoolView) {
		 String query="update P_School set Stud_Name=?,Father_Name=?,Mother_Name=?,Birth_Date=?,Standard=?,age=?,modified_On=?,Admission_date=?,Fees=? where RollNo=? ";
	    int temp=jdbctemplate.update(query, new Object[] {p_SchoolView.getStud_Name(),
				p_SchoolView.getFather_Name(),p_SchoolView.getMother_Name(),p_SchoolView.getBirth_Date(),p_SchoolView.getStandard(),
				p_SchoolView.getAge(),LocalDateTime.now(),p_SchoolView.getAdmission_date(),p_SchoolView.getFees(),p_SchoolView.getRollNo()});
//		String query1="insert into History values(?,?)";
//		jdbctemplate.update(query1, new Object[] {p_SchoolView.toString(),p_SchoolView.getRollNo()});
	    return temp;
	}

	@Override
	public Integer deleteStudent(Integer RollNo) {
	   String query="delete from P_School where RollNo=?";
	   Integer temp=jdbctemplate.update(query, new Object[] {RollNo});
	   return temp;
		
	}

	@Override
	public P_SchoolView getStudentById(Integer Id) {
		String query="select * from p_school where rollno=?";
		   P_SchoolView p_SchoolView=new P_SchoolView();
	List<Map<String,Object>> list=jdbctemplate.queryForList(query, new Object[] {Id});
	if(list.isEmpty())
		throw new IdNotFoundException(Id+" Not FOund, Please enter the valid Id!!!");
	  for(Map map: list)
	  {	  
		  p_SchoolView.setRollNo(Integer.parseInt(map.get("RollNo").toString()));
		  p_SchoolView.setStud_Name(map.get("Stud_Name").toString());
		  p_SchoolView.setFather_Name(map.get("Father_Name").toString());
		  p_SchoolView.setMother_Name(map.get("Mother_Name").toString());
		  Date date=(Date)map.get("Birth_Date");
		  p_SchoolView.setBirth_Date(date.toLocalDate());
//		  p_SchoolView.setBirth_Date(((LocalDate)map.get("Birth_Date")));
		  p_SchoolView.setStandard((int)map.get("Standard"));
		  p_SchoolView.setAge((int)(map.get("age")));
		  p_SchoolView.setCreated_On((LocalDateTime)map.get("Created_On"));
		  p_SchoolView.setModified_On((LocalDateTime)map.get("modified_On"));
		  Date date_a=(Date)map.get("Admission_date");
		  p_SchoolView.setAdmission_date(date_a.toLocalDate());
		  p_SchoolView.setFees((int)map.get("Fees"));
	  }
	  return p_SchoolView;
		
	
	}
   
}
