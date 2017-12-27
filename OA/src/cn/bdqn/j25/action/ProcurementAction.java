package cn.bdqn.j25.action;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;


import cn.bdqn.j25.pojo.Department;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.Material;
import cn.bdqn.j25.pojo.Procurement;
import cn.bdqn.j25.pojo.Provider;
import cn.bdqn.j25.pojo.State;
import cn.bdqn.j25.pojo.Types;
import cn.bdqn.j25.service.MaterialService;
import cn.bdqn.j25.service.ProcurementService;
import cn.bdqn.j25.service.ProviderService;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProcurementAction extends ActionSupport{

	private ProcurementService procurementService;
	private Procurement procurement;
	private Provider provider;
	private ProviderService providerService;
	private List<Procurement> listProcurement;
	private List<Provider> listProvider;
	private List<Material> listMaterial;
	private MaterialService materialService;
	private Material material;
	private InputStream inputStream;
	private Employee employee;
	private Department department;
	private Types type;
	private State state;
	@SuppressWarnings("unchecked")
	private Map<String, Object> request = (Map) ActionContext.getContext().get(
			"request");
	
	private String materialid;
	private String first;
	private String max="5";
	
	
	//更新供应商信息
	public String updateprovider(){
		
		String result=null;
		if(providerService.updateProvider(provider)==true){
			result="修改成功";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			result="修改失败";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return SUCCESS;
	}
	//查询所有供应商
	public String findAllprovider(){
		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setIgnoreDefaultExcludes(false); //设置默认忽略 
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);//设置循环策略为忽略    解决json最头疼的问题 死循环
		jsonConfig.setExcludes(new String[] {"orderses","materials","products","procurements","warehouses","providers","equipments"});//此处是亮点，只要将所需忽略字段加到数组中即可
		listProvider=providerService.findByPage(Integer.parseInt(first),Integer.parseInt(max));
		String jsonStr = JSONArray.fromObject(listProvider, jsonConfig).toString();
		try {
			inputStream = new ByteArrayInputStream(jsonStr.getBytes("utf-8")) ;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return SUCCESS;
	}
	
	
	
	//自动生成客户编号
	public String findProvider() throws UnsupportedEncodingException{
		listProvider=providerService.findAll();
//		System.out.println(listCustomer);
//		for (Customer c : listCustomer) {
//			c.getCustomerid();
//			c.getCustomername();
//		}
		return SUCCESS;		
	}
	//自动生成产品编号
	public String findMaterial() throws UnsupportedEncodingException{
		listMaterial=materialService.findAll();		 
		return SUCCESS;		
	}
	
	//查询单价和单位
	
	public String findprice(){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setIgnoreDefaultExcludes(false); //设置默认忽略 
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);//设置循环策略为忽略    解决json最头疼的问题 死循环
		jsonConfig.setExcludes(new String[] {"types","procurements","provider"});//此处是亮点，只要将所需忽略字段加到数组中即可
		material=materialService.findByid(Integer.parseInt(materialid));
		String jsonStr = JSONObject.fromObject(material, jsonConfig).toString();
		try {
			inputStream = new ByteArrayInputStream(jsonStr.getBytes("utf-8")) ;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		return SUCCESS;
	}
	//添加采购订单
	public String addProcurement(){	
//		System.out.println(provider.getProviderid());
//		System.out.println(material.getMaterialid());
		procurement.setProvider(provider);
		procurement.setMaterial(material);			
		procurement.setEmployeeByOriginator(employee);
		procurement.setTypes(type);
		procurement.setState(state);
		procurement.setDepartment(department);
		String result=null;		
		if(procurementService.addProcurement(procurement)!=false){
			result="添加成功";
			try {				
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return SUCCESS;
	}
	
	//查看所有订单	
	public String findProcurement() throws UnsupportedEncodingException{		
		listProcurement=procurementService.findByPage(Integer.parseInt(first),Integer.parseInt(max));	
		request.put("listProcurement", listProcurement);
		return SUCCESS;		
	}
	
	public ProcurementService getProcurementService() {
		return procurementService;
	}
	public void setProcurementService(ProcurementService procurementService) {
		this.procurementService = procurementService;
	}
	public Procurement getProcurement() {
		return procurement;
	}
	public void setProcurement(Procurement procurement) {
		this.procurement = procurement;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public ProviderService getProviderService() {
		return providerService;
	}
	public void setProviderService(ProviderService providerService) {
		this.providerService = providerService;
	}
	public List<Provider> getListProvider() {
		return listProvider;
	}
	public void setListProvider(List<Provider> listProvider) {
		this.listProvider = listProvider;
	}
	public List<Material> getListMaterial() {
		return listMaterial;
	}
	public void setListMaterial(List<Material> listMaterial) {
		this.listMaterial = listMaterial;
	}
	public MaterialService getMaterialService() {
		return materialService;
	}
	public void setMaterialService(MaterialService materialService) {
		this.materialService = materialService;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Types getType() {
		return type;
	}
	public void setType(Types type) {
		this.type = type;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Map<String, Object> getRequest() {
		return request;
	}
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public String getMaterialid() {
		return materialid;
	}
	public void setMaterialid(String materialid) {
		this.materialid = materialid;
	}
	public List<Procurement> getListProcurement() {
		return listProcurement;
	}
	public void setListProcurement(List<Procurement> listProcurement) {
		this.listProcurement = listProcurement;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	
}
