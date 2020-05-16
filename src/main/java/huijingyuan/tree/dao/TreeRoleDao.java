package huijingyuan.tree.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.tree.model.TreeRole;

@Mapper
public interface TreeRoleDao {
	@Select("select * from tree_role")
	ArrayList<TreeRole> queryAllTreeRole();
	@Select("select * from tree_role where id = #{id}")
	TreeRole queryTreeRoleById(int id);
}
