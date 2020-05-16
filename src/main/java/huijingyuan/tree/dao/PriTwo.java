package huijingyuan.tree.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.tree.model.privilege_for_two;

@Mapper
public interface PriTwo {
	@Select("select * from privilege_for_two where id_two =#{id_two}")
	public privilege_for_two queryPriTwoById(int id_two);
}
