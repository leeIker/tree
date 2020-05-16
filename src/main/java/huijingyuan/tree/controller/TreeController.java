package huijingyuan.tree.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import huijingyuan.tree.dao.BasicDao;
import huijingyuan.tree.dao.NameDao;
import huijingyuan.tree.dao.OrderDao;
import huijingyuan.tree.dao.PriTwo;
import huijingyuan.tree.dao.RoleDao;
import huijingyuan.tree.dao.TreeRoleDao;
import huijingyuan.tree.dto.TreeDto;
import huijingyuan.tree.dto.TreeRoleDto;
import huijingyuan.tree.model.Name_Privilege;
import huijingyuan.tree.model.Order_Privilege;
import huijingyuan.tree.model.Role;
import huijingyuan.tree.model.TreeRole;
import huijingyuan.tree.model.base_privilege;
import huijingyuan.tree.model.privilege_for_two;
import huijingyuan.tree.service.TreeService;
@CrossOrigin
@Controller
public class TreeController {
	/**@Autowired
	private  RoleDao rd;
	@Autowired
	private PriTwo pt;
	**/
	@Autowired
	private BasicDao bd;
	@Autowired
	private TreeService ts;
	@Autowired
	private NameDao nd;
	@Autowired
	private OrderDao od;
	@Autowired
	private TreeRoleDao td;
	@ResponseBody
	@RequestMapping("queryAllRole")
	public TreeDto queryOneRole() {
		TreeDto td=ts.queryTreeDto();
		return td;
	}
	@ResponseBody
	@RequestMapping("queryTreeRole")
	public ArrayList<TreeRole> queryBasc(){
		ArrayList<TreeRole> list= td.queryAllTreeRole();
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping("queryTree")
	public TreeRoleDto getTree() {
		 TreeRoleDto trd=ts.queryOneTree(1);
		 return trd;
	}
}
