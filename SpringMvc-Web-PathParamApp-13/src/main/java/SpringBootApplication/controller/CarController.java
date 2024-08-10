package SpringBootApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.websocket.server.PathParam;
@Controller
public class CarController {
	@GetMapping("/price/{carname}")
	@ResponseBody
	public String getCarPrice(@PathVariable("carname")String carname) {
		String msg="the book price is "+ carname+"around 7 lakhs";
		return msg;
	
		//@PathParam
		
	}
	@GetMapping("/check/{carname}/{location}/{branch}/cars")
	public String checkdetails(@PathVariable String carname,@PathVariable String location,@PathVariable String branch) {
		String remsg="name "+ carname+"location is"+location+"branch"+branch;
		return remsg;
	}
}
