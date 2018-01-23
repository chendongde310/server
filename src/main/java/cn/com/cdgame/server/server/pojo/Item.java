package cn.com.cdgame.server.server.pojo;

import javax.persistence.*;

/**
 * 作者：陈东
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

    @Column(name = "item_name")
    private String name; //物品名称

    @Column(name = "item_type")
    private int type; //物品的类型

    @Column(name = "item_level")
    private int level;//物品佩戴等级

    @Column(name = "item_rank")
    private int rank;//装备品质

    @Column(name = "item_depict")
    private String depict; //物品描述

    @Column(name = "item_random")
    private int random; //装备随机属性数（数字选择 0-6）

    @Column(name = "item_sx1")
    private int sx1;//装备必带属性1

    @Column(name = "item_sx2")
    private int sx2;//装备必带属性2

    @Column(name = "item_sx3")
    private int sx3;//装备必带属性3

    @Column(name = "item_sx4")
    private int sx4;//装备必带属性4

    @Column(name = "item_sx5")
    private int sx5;//装备必带属性5

    @Column(name = "item_sx6")
    private int sx6;//装备必带属性6

    @Column(name = "item_skill")
    private String skill; //装备被动技能


    @Column(name = "item_author")
    private String author; //装备作者

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }



    public int getSx1() {
        return sx1;
    }

    public void setSx1(int sx1) {
        this.sx1 = sx1;
    }

    public int getSx2() {
        return sx2;
    }

    public void setSx2(int sx2) {
        this.sx2 = sx2;
    }

    public int getSx3() {
        return sx3;
    }

    public void setSx3(int sx3) {
        this.sx3 = sx3;
    }

    public int getSx4() {
        return sx4;
    }

    public void setSx4(int sx4) {
        this.sx4 = sx4;
    }

    public int getSx5() {
        return sx5;
    }

    public void setSx5(int sx5) {
        this.sx5 = sx5;
    }

    public int getSx6() {
        return sx6;
    }

    public void setSx6(int sx6) {
        this.sx6 = sx6;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
