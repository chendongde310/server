package cn.com.cdgame.server.server.controller;

import cn.com.cdgame.server.server.pojo.Item;
import cn.com.cdgame.server.server.pojo.User;
import cn.com.cdgame.server.server.service.ItemService;
import cn.com.cdgame.server.server.tools.Result;
import cn.com.cdgame.server.server.tools.Utlis;
import com.google.gson.Gson;
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
            params = {"name", "type", "level", "rank", "depict", "random", "sx1", "sx2", "sx3", "sx4", "sx5", "sx6", "skill", "author"})
    String create(String name, int type, int level, int rank, String depict, int random, int sx1, int sx2, int sx3, int sx4, int sx5, int sx6, String skill, String author) {
        Item item = itemService.findByName(name);
        if (item == null) {
            item = new Item();
            item.setName(name);
            item.setType(type);
            item.setLevel(level);
            item.setRank(rank);
            item.setDepict(depict);
            item.setRandom(random);
            item.setSx1(sx1);
            item.setSx2(sx2);
            item.setSx3(sx3);
            item.setSx4(sx4);
            item.setSx5(sx5);
            item.setSx6(sx6);
            item.setSkill(skill);
            item.setAuthor(author);
            itemService.save(item);
            return Result.create(200, "创建物品成功", item);
        } else {
            return Result.create(202, "该名称物品已经存在，请修改名称", item);
        }

    }


    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String list() {
        List<Item> item = itemService.findAllBy();
        return Result.create(200, "获取装备列表成功", item);

    }


    @ResponseBody
    @RequestMapping(value = "/code", method = RequestMethod.GET)
    String code(Long id) {
        Item item = itemService.findById(id);
        if (item == null) {
            return Result.create(-1, "找不到该物品", null);
        } else {
            return Result.create(0, "转换成功", Utlis.code(item));
        }

    }


    /**
     * 获取属性列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/sx", method = RequestMethod.GET)
    String sx() {

        return Result.create(200, "获取属性列表成功", Utlis.getSxList());

    }


    /**
     * 获取类型列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/type", method = RequestMethod.GET)
    String type() {

        return Result.create(200, "获取类型列表成功", Utlis.getTypeList());

    }


}
