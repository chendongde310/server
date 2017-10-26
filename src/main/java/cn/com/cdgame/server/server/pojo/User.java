package cn.com.cdgame.server.server.pojo;

import javax.persistence.*;

/**
 * 作者：陈东  —  www.renwey.com
 * 日期：2017/10/18 - 上午11:42
 * 注释：
 */
@Entity
@Table(name = "f_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_password")
    private String userPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
