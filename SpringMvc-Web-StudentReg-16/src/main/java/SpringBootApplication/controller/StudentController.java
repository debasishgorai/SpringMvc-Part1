package SpringBootApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import SpringBootApplication.bindings.Student;
import SpringBootApplication.service.StudentService;
@Controller
public class StudentController {

	@Autowired
	private StudentService studentService; 
	
	@GetMapping("/loadForm")
	public String loadRegForm(Model model) {
		
		model.addAttribute("genders",studentService.getGenders());
		model.addAttribute("courses",studentService.getTimings());
		model.addAttribute("Timings",studentService.getTimings());
		
		
		Student s=new Student();
		model.addAttribute("Student",s);
		
		return "index";
		
	}
	
	
	
	
	
	
}
