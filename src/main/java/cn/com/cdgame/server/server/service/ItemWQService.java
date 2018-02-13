package cn.com.cdgame.server.server.service;

import cn.com.cdgame.server.server.pojo.ItemWQ;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface ItemWQService extends CrudRepository<ItemWQ, Long> {

    ItemWQ findById(Long id);

    ItemWQ findByName(String name);

    List<ItemWQ> findAllBy();
}
