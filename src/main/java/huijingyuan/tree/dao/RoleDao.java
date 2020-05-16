package huijingyuan.tree.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.tree.model.Role;

@Mapper
public interface RoleDao {
	@Select("select * from role")
	public List<Role> queryAllRole();
}
