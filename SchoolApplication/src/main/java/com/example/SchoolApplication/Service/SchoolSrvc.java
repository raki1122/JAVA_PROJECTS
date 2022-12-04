package com.example.SchoolApplication.Service;

import java.util.List;

import com.example.SchoolApplication.view.P_SchoolView;

public interface SchoolSrvc {
	  public List<P_SchoolView> getStudents();
	  public void saveStudent(P_SchoolView p_SchoolView);
	  public Integer updateStudent(P_SchoolView p_SchoolView);
}
