package appPaaS.allpass;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String home(Model model) {
        model.addAttribute("msg", "스프링 부트 애플리케이션이 성공적으로 배포되었습니다.");
        return "deployed";
    }
}
