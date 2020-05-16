package huijingyuan.tree.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.tree.model.privilege_for_three;

@Mapper
public interface PriThree {
	@Select("select * from privilege_for_three where id_three = #{id_three}")
	public privilege_for_three queryPriThreeById(int id_three);
}
