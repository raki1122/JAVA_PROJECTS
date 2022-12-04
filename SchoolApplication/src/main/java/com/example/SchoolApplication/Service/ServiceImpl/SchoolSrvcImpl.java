package com.example.SchoolApplication.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SchoolApplication.Dao.SchoolDao;
import com.example.SchoolApplication.Dao.DaoImpl.SchoolDaoImpl;
import com.example.SchoolApplication.view.P_SchoolView;

@Service
public class SchoolSrvcImpl implements SchoolDao{
     
	@Autowired
	SchoolDaoImpl schoolDaoImpl;
	
	@Override
	public List<P_SchoolView> getStudents() {
		// TODO Auto-generated method stub
		return schoolDaoImpl.getStudents();
	}

	@Override
	public void saveStudent(P_SchoolView p_SchoolView) {
		schoolDaoImpl.saveStudent(p_SchoolView);
		
	}

	@Override
	public Integer updateStudent(P_SchoolView p_SchoolView) {
		return schoolDaoImpl.updateStudent(p_SchoolView);
	}

	@Override
	public Integer deleteStudent(Integer RollNo) {
	return schoolDaoImpl.deleteStudent(RollNo);
	}

}
