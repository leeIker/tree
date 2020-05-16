package huijingyuan.tree.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.tree.model.Name_Privilege;

@Mapper
public interface NameDao {
	@Select("select * from name_privilege")
	ArrayList<Name_Privilege> queryAllNamePrivilege();
}
