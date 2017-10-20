package cn.com.cdgame.server.server.controller;

import cn.com.cdgame.server.server.pojo.User;
import cn.com.cdgame.server.server.service.UserService;
import cn.com.cdgame.server.server.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者：陈东  —  www.renwey.com
 * 日期：2017/10/18 - 上午11:50
 * 注释：
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST,
            params = {"name", "password"})
    String register(String name, String password) {

        User user = new User();
        user.setUserName(name);
        user.setUserPassword(password);
        if (userService.findByUserName(name) == null) {
            userService.save(user);
            return Result.create(0, "注册成功", user);
        } else {
            return Result.create(-1, "该账号已经被注册了", null);
        }

    }


    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test() {
        return Result.create(0, "登陆成功", null);
    }

}
