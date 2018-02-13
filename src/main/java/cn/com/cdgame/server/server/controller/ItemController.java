package cn.com.cdgame.server.server.controller;

import cn.com.cdgame.server.server.pojo.ItemFJ;
import cn.com.cdgame.server.server.pojo.ItemSP;
import cn.com.cdgame.server.server.pojo.ItemWQ;
import cn.com.cdgame.server.server.service.ItemFJService;
import cn.com.cdgame.server.server.service.ItemSPService;
import cn.com.cdgame.server.server.service.ItemWQService;
import cn.com.cdgame.server.server.tools.Result;
import cn.com.cdgame.server.server.tools.Utlis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 作者：陈东
 * 日期：2017/10/18 - 上午11:50
 * 注释：
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemFJService itemFJService;
    private ItemWQService itemWQService;
    private ItemSPService itemSPService;


    @ResponseBody
    @RequestMapping(value = "/createWQ", method = RequestMethod.POST,
            params = {"name", "type", "level", "rank", "depict","with","base1","base2","base3","sx0","sx1","sx12","sx2","sx22","skill", "author"})
    String createWQ(String name, int type, int level, int rank, String depict,
                    int with, int base1, int base2, int base3, int sx0, int sx1, int sx12,int sx2,int sx22,  String skill, String author) {
         ItemWQ itemWQ = itemWQService.findByName(name);
        if (itemWQ == null) {
            itemWQ = new ItemWQ();
            itemWQ.setName(name);
            itemWQ.setType(type);
            itemWQ.setLevel(level);
            itemWQ.setRank(rank);
            itemWQ.setDepict(depict);
            itemWQ.setSkill(skill);
            itemWQ.setAuthor(author);
            itemWQ.setWith(with);
            itemWQ.setBase1(base1);
            itemWQ.setBase2(base2);
            itemWQ.setBase3(base3);
            itemWQ.setSx0(sx0);
            itemWQ.setSx1(sx1);
            itemWQ.setSx12(sx12);
            itemWQ.setSx2(sx2);
            itemWQ.setSx22(sx22);
            itemWQService.save(itemWQ);
            return Result.create(200, "创建武器成功", itemWQ);
        } else {
            return Result.create(202, "存在同名武器，请修改名称", itemWQ);
        }

    }


    @ResponseBody
    @RequestMapping(value = "/createFJ", method = RequestMethod.POST,
            params = {"name", "type", "level", "rank", "depict","base1","base2","base3","sx0","sx1","sx1","sx3","skill", "author"})
    String createFJ(String name, int type, int level, int rank, String depict, int base1, int base2, int base3, int sx0, int sx1, int sx2,int sx3, String skill, String author) {
        ItemFJ itemFJ = itemFJService.findByName(name);
        if (itemFJ == null) {
            itemFJ = new ItemFJ();
            itemFJ.setName(name);
            itemFJ.setType(type);
            itemFJ.setLevel(level);
            itemFJ.setRank(rank);
            itemFJ.setDepict(depict);
            itemFJ.setSkill(skill);
            itemFJ.setAuthor(author);
            itemFJ.setBase1(base1);
            itemFJ.setBase2(base2);
            itemFJ.setBase3(base3);
            itemFJ.setSx0(sx0);
            itemFJ.setSx1(sx1);
            itemFJ.setSx2(sx2);
            itemFJ.setSx3(sx3);
            itemFJService.save(itemFJ);
            return Result.create(200, "创建防具成功", itemFJ);
        } else {
            return Result.create(202, "存在同名防具，请修改名称", itemFJ);
        }

    }


    @ResponseBody
    @RequestMapping(value = "/createSP", method = RequestMethod.POST,
            params = {"name", "type", "level", "rank", "depict","with","base1","base2","base3","sx0","sx1","sx12","sx2","sx3","skill", "author"})
    String createSP(String name, int type, int level, int rank, String depict,
                    int with, int base1, int base2, int base3, int sx0, int sx1, int sx12,int sx2,int sx3,  String skill, String author) {
        ItemSP itemSP = itemSPService.findByName(name);
        if (itemSP == null) {
            itemSP = new ItemSP();
            itemSP.setName(name);
            itemSP.setType(type);
            itemSP.setLevel(level);
            itemSP.setRank(rank);
            itemSP.setDepict(depict);
            itemSP.setSkill(skill);
            itemSP.setAuthor(author);
            itemSP.setWith(with);
            itemSP.setBase1(base1);
            itemSP.setBase2(base2);
            itemSP.setBase3(base3);
            itemSP.setSx0(sx0);
            itemSP.setSx1(sx1);
            itemSP.setSx2(sx2);
            itemSP.setSx12(sx12);
            itemSP.setSx3(sx3);
            itemSPService.save(itemSP);
            return Result.create(200, "创建饰品成功", itemSP);
        } else {
            return Result.create(202, "存在同名饰品，请修改名称", itemSP);
        }

    }




//    @ResponseBody
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    String list() {
//        List<Item> item = itemSPService.findAllBy();
//        return Result.create(200, "获取装备列表成功", item);
//
//    }
//
//
//    @ResponseBody
//    @RequestMapping(value = "/code", method = RequestMethod.GET)
//    String code(String name) {
//        Item item = itemService.findByName(name);
//        if (item == null) {
//            return Result.create(-1, "找不到该物品", null);
//        } else {
//            return Result.create(0, "转换成功", Utlis.code(item));
//        }
//
//    }


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
