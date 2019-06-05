package mallfe.demo.web;

import lombok.extern.slf4j.Slf4j;
import mallfe.demo.pojo.User;
import mallfe.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author Yangbin
 * @since 2019/06/04
 */
@Slf4j
@RestController
@RequestMapping("user")
public class HelloController {
//    @Autowired
//    private DataSource dataSource;

    @Autowired
    UserService userService;

    @GetMapping("{id}")
    public User hello(@PathVariable("id") Long id){
        return userService.queryById(id);
    }
}
