package cn.com.cdgame.server.server.pojo;

import javax.persistence.*;

/**
 * Created by chen on 2018/3/27.
 * 下午4:05
 */

@Entity
@Table(name = "f_otaku")
public class Otaku {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

    @Column(name = "key")
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
