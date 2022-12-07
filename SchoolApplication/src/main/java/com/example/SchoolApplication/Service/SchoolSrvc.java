package com.example.SchoolApplication.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.SchoolApplication.view.P_SchoolView;

public interface SchoolSrvc {
	  public List<P_SchoolView> getStudents();
	  public ResponseEntity<P_SchoolView> saveStudent(P_SchoolView p_SchoolView);
	  public Integer updateStudent(P_SchoolView p_SchoolView);
	  public Integer deleteStudent(Integer RollNo);
	  public P_SchoolView getStudentById(Integer Id);
}
