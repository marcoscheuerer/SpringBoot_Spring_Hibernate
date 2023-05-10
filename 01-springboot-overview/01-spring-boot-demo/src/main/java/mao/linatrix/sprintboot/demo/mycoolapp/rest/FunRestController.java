package mao.linatrix.sprintboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  FunRestController{
    @Value("${coach.name}")
    private String coachName;
    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello " + coachName + "</h1>";
    }
}
