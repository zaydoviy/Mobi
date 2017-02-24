package zaydoviy.Mobileshop.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import zaydoviy.Mobileshop.entity.Color;
import zaydoviy.Mobileshop.service.ColorService;

public class ColorController {
	
	@Autowired
	private ColorService colorService;
	
	@GetMapping
	public String show (Color color){
		color.addAttribute("colors", colorService.findAll());
		return "admin-color";
	}
	
	@GetMapping("/delete/{id}")
	public String delete (@PathVariable int id){
		colorService.delete(id);
		return "redirect:/admin/producer";
	}
	@PostMapping
	public String

}
