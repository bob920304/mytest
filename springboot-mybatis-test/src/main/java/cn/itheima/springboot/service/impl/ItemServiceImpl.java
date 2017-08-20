package cn.itheima.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itheima.springboot.mapper.ItemMapper;
import cn.itheima.springboot.pojo.Item;
import cn.itheima.springboot.service.ItemService;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	@Resource
	private ItemMapper itemMapper;

	@Override
	public void addItem() {

	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int total() {

		return itemMapper.total();
	}

	@Override
	public Map<String, Object> findPageBySize(Integer page, Integer rows) {
		HashMap<String, Object> date = new HashMap<>();
		Long total = (long) itemMapper.total();
		date.put("total", total);
		List<Item> list = itemMapper.findByPage((page - 1) * rows, rows);
		date.put("rows", list);
		return date;
	}

}
