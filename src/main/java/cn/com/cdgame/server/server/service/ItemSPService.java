package cn.com.cdgame.server.server.service;

import cn.com.cdgame.server.server.pojo.Item;
import cn.com.cdgame.server.server.pojo.ItemFJ;
import cn.com.cdgame.server.server.pojo.ItemSP;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface ItemSPService extends CrudRepository<ItemSP, Long> {

    ItemSP findById(Long id);

    ItemSP findByName(String name);

    List<ItemSP> findAllBy();
}
