package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
 * 商品管理Controller
 * @author hasee
 *
 */
@Controller
@RequestMapping("/item")
public class ItemController {
	// 添加itemSerivice依赖
	@Autowired
	private ItemService itemService;
	
	/**
	 * 调用service方法根据id查询item
	 */
	@RequestMapping("/{itemId}")
	@ResponseBody
	public TbItem geItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}

}
