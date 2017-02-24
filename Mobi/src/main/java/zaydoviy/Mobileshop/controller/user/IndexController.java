package zaydoviy.Mobileshop.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	
	@RequestMapping("/")
	public String some (){
		return "user-index";
	}
}
