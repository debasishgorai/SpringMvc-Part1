package SpringBootApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class CourseController {
@GetMapping("/course")
@ResponseBody
	public String getCourseDtls(String cname,String trainer) {
		if(cname.equals("SBMS")) {
		String msg=cname+"By"+trainer+"start from 23 june";
		return msg;
		}
		else if(cname.equals("JRTP")) {
		String msg=cname+"By"+trainer+"start from 29 june";
	return msg;
		}
		return "contact Debasish";
	}
	
	
	
	
	
	
	
	
	
	
}
