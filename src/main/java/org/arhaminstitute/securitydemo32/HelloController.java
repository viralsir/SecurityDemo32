package org.arhaminstitute.securitydemo32;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "session id "+request.getSession().getId();
    }

}
