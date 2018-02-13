package cn.com.cdgame.server.server.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 武器
 */
@Entity
@Table(name = "t_item_wq")
public class ItemWQ extends Item {

    @Column(name = "item_with")
    private int with; //武器偏向

    @Column(name = "item_base1")
    private int base1; //护甲

    @Column(name = "item_base2")
    private int base2; //攻击速度

    @Column(name = "item_base3")
    private int base3; //基础属性

    @Column(name = "item_sx0")
    private int sx0; //特殊伤害

    @Column(name = "item_sx1")
    private int sx1; //主要攻击属性

    @Column(name = "item_sx12")
    private int sx12; //主要攻击属性2


    @Column(name = "item_sx2")
    private int sx2; //次要随机属性

    @Column(name = "item_sx22")
    private int sx22; //次要随机属性2

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

    public int getSx12() {
        return sx12;
    }

    public void setSx12(int sx12) {
        this.sx12 = sx12;
    }

    public int getSx2() {
        return sx2;
    }

    public void setSx2(int sx2) {
        this.sx2 = sx2;
    }

    public int getSx22() {
        return sx22;
    }

    public void setSx22(int sx22) {
        this.sx22 = sx22;
    }
}
