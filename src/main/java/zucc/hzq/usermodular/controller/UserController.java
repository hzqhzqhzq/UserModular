package zucc.hzq.usermodular.controller;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import zucc.hzq.usermodular.service.UserService;
        import zucc.hzq.usermodular.util.ResultDto;

/**
 * @Auther: 何圳青
 * @Date: Created in 14:51 2019/1/28
 * @Description:
 * @Modified By:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResultDto login(){
        return userService.login();
    }
}
