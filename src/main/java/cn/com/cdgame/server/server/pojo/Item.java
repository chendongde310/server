package cn.com.cdgame.server.server.pojo;

import javax.persistence.*;

/**
 * 作者：陈东
 * 日期：2017/10/18 下午3:52
 * 注释：
 */

public class Item {
    public static final int RANDOM = 666;
    public static final int NO = 0;

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
    private int level;//物品等级

    @Column(name = "item_rank")
    private int rank;//装备品质

    @Column(name = "item_depict")
    private String depict; //物品描述


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


    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
