package cn.com.cdgame.server.server.pojo;


import javax.persistence.*;

/**
 * 防具
 */
@Entity
@Table(name = "t_item_fj")
public class ItemFJ {

    public static final int RANDOM = 666;
    public static final int NO = 0;
    @Column(name = "item_with")
    private int with; //护甲偏向
    @Column(name = "item_base1")
    private int base1; //护甲
    @Column(name = "item_base2")
    private int base2; //体能
    @Column(name = "item_base3")
    private int base3; //基础属性
    @Column(name = "item_sx0")
    private int sx0; //防御属性
    @Column(name = "item_sx1")
    private int sx1; //攻击属性
    @Column(name = "item_sx2")
    private int sx2; //生命属性
    @Column(name = "item_sx3")
    private int sx3; //其他属性
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getBase1() {
        return base1;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public int getBase2() {
        return base2;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    public int getBase3() {
        return base3;
    }

    public void setBase3(int base3) {
        this.base3 = base3;
    }

    public int getSx0() {
        return sx0;
    }

    public void setSx0(int sx0) {
        this.sx0 = sx0;
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
}
