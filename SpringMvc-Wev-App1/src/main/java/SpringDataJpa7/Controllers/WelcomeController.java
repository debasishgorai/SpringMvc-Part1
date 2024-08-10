package SpringDataJpa7.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
