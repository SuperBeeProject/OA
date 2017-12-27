package cn.bdqn.j25.action;

import java.util.List;
import java.util.Map;

import cn.bdqn.j25.pojo.Types;
import cn.bdqn.j25.service.TypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TypeAction extends ActionSupport {

	private TypeService typeService;

	public String find() {
		List<Types> list = typeService.findAll();
		Map<String, Object> request = (Map) ActionContext.getContext().get(
				"request");
		request.put("type", list);
		return SUCCESS;

	}

	public TypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
}
