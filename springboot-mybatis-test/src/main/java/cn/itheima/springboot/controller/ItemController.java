package cn.itheima.springboot.controller;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itheima.springboot.service.ItemService;

@Controller
public class ItemController {
		@Resource
		private ItemService itemService;
		
		@RequestMapping("/show")
		public String show(){
			return "notice.html";
		}
		@PostMapping("/findByPage")
		@ResponseBody
		public Map<String, Object> findBy(@RequestParam(value="page", defaultValue="1") Integer page,
		@RequestParam(value="rows", defaultValue="15") Integer rows){
			return itemService.findPageBySize(page, rows);
		}
}


