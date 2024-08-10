package Application.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {
	@GetMapping("/welcome")
public ModelAndView displayWelcomeMsg() {
	ModelAndView mav= new ModelAndView();
	mav.addObject("msg","i love you");
	mav.setViewName("index");
	return mav;
	}
	
	//@GetMapping("/welcome")
	@RequestMapping(value="/greet",method = RequestMethod.GET)
	
	public ModelAndView displaygreetMsg() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg","i yuyh you");
		mav.setViewName("index");
		return mav;
		
	
}
}
