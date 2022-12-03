package com.example.SchoolApplication.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SchoolApplication.Service.ServiceImpl.SchoolSrvcImpl;
import com.example.SchoolApplication.view.P_SchoolView;

@RestController
public class RestControler {
    
	@Autowired
	SchoolSrvcImpl schoolSrvcImpl;
	
	@GetMapping("/GetStudent")
	public List<P_SchoolView> getStudent()
	{
		return schoolSrvcImpl.getStudents();
	}
}
