package cn.com.cdgame.server.server.service;

import cn.com.cdgame.server.server.pojo.Item;
import cn.com.cdgame.server.server.pojo.ItemFJ;
import cn.com.cdgame.server.server.pojo.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface ItemFJService extends CrudRepository<ItemFJ, Long> {

    ItemFJ findById(Long id);

    ItemFJ findByName(String name);

    List<ItemFJ> findAllBy();
}
