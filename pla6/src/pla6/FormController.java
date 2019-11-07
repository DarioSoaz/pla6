package pla6;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class FormController {

	@RequestMapping("/verform")
	public String verForm(Model modelo) {
		alumno alumno = new alumno();
		modelo.addAttribute("alumno", alumno);
		return "formulario";
	}

	@RequestMapping("/procesarAlumno")
	public String procesarAlumno(@Valid @ModelAttribute("alumno") alumno alumno, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "formulario";
		} else {
			return "procesarAlumno";
		}
	}
}
