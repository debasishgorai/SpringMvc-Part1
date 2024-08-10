package Application.Controllers;

import java.time.LocalDate;
import java.util.Date;

//import java.sql.Date;

//import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class DateController {
	@GetMapping("/date")
	public ModelAndView getTodaysDate() {
		ModelAndView mav= new ModelAndView();
		Date d=new Date();
		LocalDate id=LocalDate.now();
		
		mav.addObject("msg","Todays Date");
		mav.setViewName("index");
		return mav;
		
	
}
}
