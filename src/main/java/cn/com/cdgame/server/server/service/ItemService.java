package cn.com.cdgame.server.server.service;

import cn.com.cdgame.server.server.pojo.Item;
import cn.com.cdgame.server.server.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 作者：陈东  —  www.renwey.com
 * 日期：2017/10/18 - 上午11:46
 * 注释：
 */
public interface ItemService extends JpaRepository<Item, Long> {

    User findById(Long id);
}
