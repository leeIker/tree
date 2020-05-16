package huijingyuan.tree.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.tree.model.Name_Privilege;
import huijingyuan.tree.model.Order_Privilege;

@Mapper
public interface OrderDao {
	@Select("select * from order_privilege")
	ArrayList<Order_Privilege> queryAllOrder();
	@Select("select * from order_privilege where id_order=#{id1}")
	Order_Privilege  queryOderById(int id1);
}
