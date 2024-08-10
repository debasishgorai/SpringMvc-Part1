package SpringBootApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {
  @GetMapping("/price")
  @ResponseBody
	public String getBookPrice(@RequestParam(name="isbn",required = false,defaultValue = "ISBN009")String str) {
		String msg="the book price is "+ str+"4880.00";
		return msg;
	
		
	}
	
	
}
