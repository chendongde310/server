package cn.com.cdgame.server.server.service;

import cn.com.cdgame.server.server.pojo.Item;
import cn.com.cdgame.server.server.pojo.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * 作者：陈东  —  www.renwey.com
 * 日期：2017/10/18 - 上午11:46
 * 注释：
 */
@Transactional
public interface ItemService extends CrudRepository<Item, Long> {

    User findById(Long id);
}
