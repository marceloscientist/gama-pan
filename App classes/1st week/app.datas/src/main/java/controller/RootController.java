package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RootController {

	@GetMapping("/hello")
	public String Hello() {
		return "Hello world";
	}

/*	@GetMapping("/list-all")
	public List<Tarefas> getAll(){
		return  repository.findAll();
	}
*/
}
