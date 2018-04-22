package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
 * 商品管理Service
 * @author hasee
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
	// 添加依赖
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long id) {
		TbItem item = itemMapper.selectByPrimaryKey(id);
		return item;
	}

}
