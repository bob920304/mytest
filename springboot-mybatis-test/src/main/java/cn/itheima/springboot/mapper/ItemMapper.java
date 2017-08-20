package cn.itheima.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itheima.springboot.pojo.Item;

@Mapper
public interface ItemMapper {
	@Select("select count(*) from product")
	public int total();

	List<Item> findByPage(@Param("page")Integer page, @Param("rows")Integer rows);

}
