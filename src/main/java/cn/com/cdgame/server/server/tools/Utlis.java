package cn.com.cdgame.server.server.tools;

import cn.com.cdgame.server.server.pojo.Item;

/**
 * Created by chen on 2018/1/23.
 */
public class Utlis {


    private static int getType(String type) {
        if ("头盔".equals(type)) {
            return 1;
        } else if ("护肩".equals(type)) {
            return 2;
        } else if ("项链".equals(type)) {
            return 3;
        } else if ("胸甲".equals(type)) {
            return 4;
        } else if ("腰带".equals(type)) {
            return 5;
        } else if ("裤子".equals(type)) {
            return 6;
        } else if ("护腿".equals(type)) {
            return 7;
        } else if ("鞋子".equals(type)) {
            return 8;
        } else if ("手套".equals(type)) {
            return 9;
        } else if ("戒指".equals(type)) {
            return 10;
        } else if ("主武器".equals(type)) {
            return 11;
        } else if ("副武器".equals(type)) {
            return 12;
        } else {
            return 0;
        }
    }

    private static String getType(int code) {
        switch (code) {
            case 1:
                return "头盔";
            case 2:
                return "护肩";
            case 3:
                return "项链";
            case 4:
                return "胸甲";
            case 5:
                return "腰带";
            case 6:
                return "裤子";
            case 7:
                return "护腿";
            case 8:
                return "鞋子";
            case 9:
                return "手套";
            case 10:
                return "戒指";
            case 11:
                return "主武器";
            case 12:
                return "副武器";
            default:
                return "未知";
        }
    }



    //创建物品数据，传入装备ID,可破坏物ID，装备名字，装备介绍，装备类型，装备品质，装备等级
    // 随机属性数量，必带属性1，必带属性2，必带属性3，必带属性4，必带属性5，必带属性6
    public static String code(Item i) {

        StringBuffer itemcode = new StringBuffer("\n\n//" + i.getName() + "(" + getType(i.getType()) + ")").append("\n");
        itemcode.append("//-----------------------------------------\n");
        itemcode.append("call YDLocal1Set(string, 'itemId', '装备ID')").append("\n");
        itemcode.append("call CreateItemDatas(YDLocal1Get(string, \"itemId\"),\"图标ID\",")
                .append(i.getName()).append("\"").append(",")
                .append("\"|cffffcc00E").append(i.getDepict()).append("\"").append(",")
                .append(i.getType()).append(",")
                .append(i.getRank()).append(",")
                .append(i.getLevel())
                .append(")").append("\n");
        itemcode.append("call AddItemAttributes(YDLocal1Get(string, \"itemId\")").append(",")
                .append(i.getRandom()).append(",");//随机属性数量
        itemcode.append(i.getSx1()).append(",");//必带属性1
        itemcode.append(i.getSx2()).append(",");//必带属性2
        itemcode.append(i.getSx3()).append(",");//必带属性3
        itemcode.append(i.getSx4()).append(",");//必带属性4
        itemcode.append(i.getSx5()).append(",");//必带属性5
        itemcode.append(i.getSx6()).append(")").append("\n");//必带属性6
        itemcode.append("//-----------------------------------------\n\n");
        return itemcode.toString();


    }
}
