package com.example.SchoolApplication.Dao.DaoImpl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
		  p_SchoolView.setBirth_Date(((LocalDate)map.get("Birth_Date")));
		  p_SchoolView.setStandard((int)map.get("Standard"));
		  p_SchoolView.setAge((int)(map.get("age")));
		  p_SchoolView.setCreated_On((LocalTime)map.get("Created_On"));
		  p_SchoolView.setModified_On((LocalTime)map.get("modified_On"));
		  p_SchoolView.setAdmission_date((LocalDate)(map.get("Admission_date")));
		  p_SchoolView.setFees((int)map.get("Fees"));
		  listStud.add(p_SchoolView);
	  }
	  return listStud;
	}
   
}
