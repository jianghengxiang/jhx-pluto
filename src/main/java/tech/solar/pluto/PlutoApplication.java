package tech.solar.pluto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class PlutoApplication {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

	public static void main(String[] args) {
		SpringApplication.run(PlutoApplication.class, args);
	}
}
