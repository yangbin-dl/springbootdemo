package mallfe.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author Yangbin
 * @since 2019/06/04
 */
@RestController
public class HelloController {
//    @Autowired
//    private DataSource dataSource;

    @GetMapping
    public String hello(){
        return "hellp, spring boot!";
    }
}
