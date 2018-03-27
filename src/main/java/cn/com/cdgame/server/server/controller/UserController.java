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


    /**
     * 查询个人信息
     * 我的心在心中
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public @ResponseBody
    String info(String name) {
        User user = userService.findByUserName(name);
        if (user == null) {
            return Result.create(-1, "该用户名尚未注册", null);
        } else {
            return Result.create(0, "查询成功", userService.findByUserName(name));
        }

    }

    /**
     * 登录
     *
     * @param id 用户ID，在客户端保存在本地
     * @return 用户信息
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    String login(Long id, String password) {
        User user = userService.findById(id);
        if (user == null) {
            return Result.create(-1, "该用户名尚未注册", null);
        } else {
            if (user.getUserPassword().equals(password)) {
                System.out.println("登陆成功:" + user);
                return Result.create(0, "登陆成功", user);
            } else {
                return Result.create(-2, "登陆标识密码错误", user);
            }
        }
    }


}
