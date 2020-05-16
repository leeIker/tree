package huijingyuan.tree.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.tree.model.base_privilege;

@Mapper
public interface BasicDao {
	@Select("select * from base_privilege")
	ArrayList<base_privilege> queryAllBase();
	@Select("select * from base_privilege where id_basc=#{id1} or id_basc=#{id2} or id_basc=#{id3}")
	ArrayList<base_privilege> queryBaseById(int id1,int id2,int id3);
}
