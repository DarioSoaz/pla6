package pla6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class inicioController {
	@RequestMapping("/")
	public String verPagina() {
		return "inicio";
	}

}
