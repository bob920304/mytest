package cn.itheima.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itheima.springboot.pojo.Item;

public interface ItemService {
		void addItem();
		public List<Item> findAll();
		//统计total
		public int total();
		
		public Map<String,Object> findPageBySize(Integer page,Integer rows);
		
}
