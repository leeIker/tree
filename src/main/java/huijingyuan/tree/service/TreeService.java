package huijingyuan.tree.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huijingyuan.tree.dao.BasicDao;
import huijingyuan.tree.dao.OrderDao;
import huijingyuan.tree.dao.PriThree;
import huijingyuan.tree.dao.PriTwo;
import huijingyuan.tree.dao.RoleDao;
import huijingyuan.tree.dao.TreeRoleDao;
import huijingyuan.tree.dto.BasePrivilegeDto;
import huijingyuan.tree.dto.OrderPrivilegeDto;
import huijingyuan.tree.dto.TreeDto;
import huijingyuan.tree.dto.TreeRoleDto;
import huijingyuan.tree.model.Order_Privilege;
import huijingyuan.tree.model.Role;
import huijingyuan.tree.model.TreeRole;
import huijingyuan.tree.model.base_privilege;
import huijingyuan.tree.model.privilege_for_three;
import huijingyuan.tree.model.privilege_for_two;

@Service
public class TreeService {
	@Autowired
	private RoleDao rd;
	@Autowired
	private PriTwo pt;
	@Autowired
	private BasicDao bd;
	
	@Autowired
	private PriThree pth;
	public TreeDto queryTreeDto() {
		Role role=rd.queryAllRole().get(0);
		TreeDto td=new TreeDto();
		td.setId(role.getId());
		td.setName(role.getName());
		
		privilege_for_two priTwo= pt.queryPriTwoById(role.getId_two());
		td.setId_two(priTwo);
		
		privilege_for_three priThree=pth.queryPriThreeById(role.getId_Three());
		td.setId_Three(priThree);
		return td;
	}
	
	public TreeRoleDto trans(TreeRole treeRole) {
		TreeRoleDto trd=new TreeRoleDto();
		trd.setId(treeRole.getId());
		trd.setName(treeRole.getName());
		return trd;
	}
	
	public OrderPrivilegeDto trans(Order_Privilege orderPrivilege) {
		OrderPrivilegeDto opd=new OrderPrivilegeDto();
		opd.setId(orderPrivilege.getId_order());
		opd.setName(orderPrivilege.getName());
		return opd;
	}
	
	public BasePrivilegeDto trans(base_privilege bp) {
		BasePrivilegeDto bpd=new BasePrivilegeDto();
		bpd.setId(bp.getId_basc());
		bpd.setName(bp.getName());
		bpd.setValue(bp.isValue());
		return bpd;
	}
	
	@Autowired
	private TreeRoleDao td;
	
	@Autowired
	private OrderDao od;
	
	public TreeRoleDto queryOneTree( int id) {
		TreeRole treeRole=td.queryTreeRoleById(1);
		TreeRoleDto trd=trans(treeRole);
		Order_Privilege orderPrivilege= od.queryOderById(treeRole.getId_order());
		OrderPrivilegeDto opd=trans(orderPrivilege);
		ArrayList<base_privilege> baseList=bd.queryBaseById(orderPrivilege.getAdd_order(), orderPrivilege.getDelete_order(),orderPrivilege.getModify_order());
		ArrayList<BasePrivilegeDto> bList=new ArrayList<BasePrivilegeDto>();
		for(int i=0;i<baseList.size();i++) {
			BasePrivilegeDto brd=trans(baseList.get(i));
			bList.add(brd);
		}
		opd.setChildren(bList);
		ArrayList al=new ArrayList();
		al.add(opd);
		trd.setChildren(al);;
		return trd;
	}
	
	
}
