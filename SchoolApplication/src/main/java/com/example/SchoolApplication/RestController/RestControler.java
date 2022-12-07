package com.example.SchoolApplication.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SchoolApplication.CustomExce.IdNotFoundException;
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
	@PostMapping("/SaveStudent")
	public ResponseEntity<P_SchoolView> saveStudent(@RequestBody P_SchoolView p_SchoolView)
	{
		return schoolSrvcImpl.saveStudent(p_SchoolView);
	}
	@PutMapping("/UpdateStudent")
	public String updateStudent(@RequestBody P_SchoolView p_SchoolView)
	{
		Integer temp=schoolSrvcImpl.updateStudent(p_SchoolView);
			
			return p_SchoolView.getRollNo()+" is update successfully";
		
	}
	@DeleteMapping("/DeleteMapping/{RollNo}")
	public String deleteStudent(@PathVariable Integer RollNo)
	{
	  Integer Temp=schoolSrvcImpl.deleteStudent(RollNo);
	  return RollNo+" deleted Successfully!!";
	}
	@GetMapping("/GetStudent/{Id}")
	public P_SchoolView getStudent(@PathVariable Integer Id)
	{
		P_SchoolView p_SchoolView= schoolSrvcImpl.getStudentById(Id);
		System.out.println(p_SchoolView);
//		if(p_SchoolView)
//		throw new IdNotFoundException(Id+" Not FOund, Please enter the valid Id");
	 
		return p_SchoolView;
	}
	
}
