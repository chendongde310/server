package cn.com.cdgame.server.server.pojo;

import javax.persistence.*;

/**
 * 作者：陈东  —  www.renwey.com
 * 日期：2017/10/18 下午3:52
 * 注释：
 */
@Entity
@Table(name = "t_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "item_iconId")
    private int iconId; //图标id
    @Column(name = "item_level")
    private int level;//物品等级
    @Column(name = "item_clazz")
    private int clazz;//物品适用职业（0：无职业，1：战士。2：法师，3：刺客）
    @Column(name = "item_price")
    private int price; //物品售价
    @Column(name = "item_itemType")
    private int itemType; //物品的种类 （ 1.装备 2.道具 3.材料 4.杂货 5. 特殊物品）
    @Column(name = "item_grade")
    private int grade;//物品评分（0.浅黑色 1.绿色 2.蓝色 3.紫色 4.橙色 5.粉色 6.红色）从低到高
    @Column(name = "item_bind")
    private boolean bind; //物品是否绑定
    @Column(name = "item_wear")
    private boolean wear; //是否可以佩戴
    @Column(name = "item_name")
    private String name; //物品名称
    @Column(name = "item_depict")
    private String depict; //物品描述

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isBind() {
        return bind;
    }

    public void setBind(boolean bind) {
        this.bind = bind;
    }

    public boolean isWear() {
        return wear;
    }

    public void setWear(boolean wear) {
        this.wear = wear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }
}
