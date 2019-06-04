package mallfe.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author Yangbin
 * @since 2019/06/04
 */
@Slf4j
@RestController
public class HelloController {
//    @Autowired
//    private DataSource dataSource;

    @GetMapping
    public String hello(){
        log.debug("hellp method is running");
        return "hellp, spring boot!";
    }
}
