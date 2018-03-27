package cn.com.cdgame.server.server.controller;

import cn.com.cdgame.server.server.pojo.Otaku;
import cn.com.cdgame.server.server.service.OtakuService;
import cn.com.cdgame.server.server.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 作者：陈东  —
 * 日期：2017/10/18 - 上午11:50
 * 注释：
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/otaku")
public class OTAKUController {


    static final String PASSWORD = "chendongde310";
    @Autowired
    private OtakuService otakuService;


    /**
     * 查询个人信息
     */
    @RequestMapping(value = "/key", method = RequestMethod.GET)
    public @ResponseBody
    String info() {
        List<Otaku> otakus = otakuService.findAll();
        if (otakus != null && otakus.get(0) != null) {
            return Result.create(0, "KET获取成功", otakus.get(0).getKey());

        } else {
            return Result.create(-1, "KEY获取失败", null);
        }

    }


    @ResponseBody
    @RequestMapping(value = "/updata", method = RequestMethod.POST,
            params = {"password", "key"})
    String updata(String password, String key) {

        Otaku otaku = new Otaku();
        otaku.setKey(key);
        if (PASSWORD.equals(password)) {
            otakuService.save(otaku);
            return Result.create(0, "更新成功", otaku);
        } else {
            return Result.create(-1, "密码错误", null);
        }

    }


}
