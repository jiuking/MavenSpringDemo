import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/SpringDemo/rest/page")
public class LoginController {
	
	@RequestMapping(value="/login")
	public ModelAndView toIndex(){
		ModelAndView mv = this.getModelAndView();
		mv.addObject("/rest/index");
	}
}
