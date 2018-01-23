package cn.com.cdgame.server.server.controller;

import cn.com.cdgame.server.server.pojo.Item;
import cn.com.cdgame.server.server.pojo.User;
import cn.com.cdgame.server.server.service.ItemService;
import cn.com.cdgame.server.server.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 作者：陈东  —  www.renwey.com
 * 日期：2017/10/18 - 上午11:50
 * 注释：
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;


    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST,
            params = {"name"})
    String create(String name) {

        Item item = new Item();
        item.setName(name);
        item.setDepict("没有说明的一件装备");
        item.setLevel(20);
        itemService.save(item);
        return Result.create(200, "创建物品成功", item);

    }


    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
        String list() {
        List<Item> item = itemService.findAllBy();
        return Result.create(200, "查询成功", itemService.findAllBy());

    }


}
