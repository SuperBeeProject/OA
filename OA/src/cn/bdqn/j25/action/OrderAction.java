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

import cn.bdqn.j25.pojo.Customer;
import cn.bdqn.j25.pojo.Department;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.Monitoring;
import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.pojo.Product;
import cn.bdqn.j25.pojo.Proorder;
import cn.bdqn.j25.pojo.State;
import cn.bdqn.j25.pojo.Types;
import cn.bdqn.j25.service.CustomerService;
import cn.bdqn.j25.service.MonitoringService;
import cn.bdqn.j25.service.OrdersService;
import cn.bdqn.j25.service.ProductService;
import cn.bdqn.j25.service.ProorderService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport{

	private OrdersService ordersService;
	private Orders orders;
	private Customer customer;
	private Proorder proorder;
	private Monitoring monitoring;
	private MonitoringService monitoringService;
	private CustomerService customerService;
	private ProorderService proorderService;
	private List<Monitoring> listMonitoring;
	private List<Orders> listOrders;
	private List<Customer> listCustomer;
	private List<Product> listProduct;
	private List<Proorder> listProorder;
	private ProductService productService;
	private Product product;
	private InputStream inputStream;
	private Employee employee;
	private Department department;
	private Types type;
	private State state;
	private String productid;
	private String first;
	private String max="5";
	private String employeeByProorderpeople;
	private String employeeByProducter;
	@SuppressWarnings("unchecked")
	private Map<String, Object> request = (Map) ActionContext.getContext().get(
			"request");
	
	
	public String addCustomer(){
		String result=null;
		if(customerService.addCustomer(customer)==true){
			result="添加成功";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			result="添加失败";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		return SUCCESS;
	}
	
	//查看生产记录
	public String findAllMon(){
		listMonitoring=monitoringService.findByPage(Integer.parseInt(first),Integer.parseInt(max));
		for (Monitoring monitoring : listMonitoring) {
			System.out.println(monitoring.getOrders().getCustomer().getCustomername());
		}
		
		request.put("monlist", listMonitoring);
		return SUCCESS;
	}
	
	//添加生产记录
	public String addMon(){
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		employee1.setEmployeeid(Integer.parseInt(employeeByProorderpeople));
		employee2.setEmployeeid(Integer.parseInt(employeeByProducter));
		monitoring.setEmployeeByProducter(employee2);
		monitoring.setEmployeeByProorderpeople(employee1);
		monitoring.setOrders(orders);
		String result=null;
		if(monitoringService.addMonitoring(monitoring)==true){
			result="添加成功";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			result="添加失败";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return SUCCESS;
	}
	
	//根据生产任务单id查询
	public String findProorderByid(){		
		proorder=proorderService.findByid(proorder.getProorderid());
		request.put("proorder", proorder);
		return SUCCESS;
	}
		
	//查看生产任务单
	public String findAllProorder(){
		listProorder =proorderService.findAllProorder();
		request.put("Proorder", listProorder);
		for (Proorder proorder : listProorder) {
			System.out.println(proorder.getOrders().getCustomer().getCustomername());
		}
		return SUCCESS;
	}
	
	//添加生产任务单
	public String addProOrders(){
		proorder.setEmployee(employee);
		proorder.setOrders(orders);		
		String result=null;
		if(proorderService.addProorder(proorder)==true){
			result="添加成功";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			result="添加失败";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return SUCCESS;
	}
	
	
	//生产部查看所有财务审核过的订单
	public String findOrdersByfinance(){		
		listOrders=ordersService.findAllOrderByFinance();
		request.put("product", listOrders);			
		return SUCCESS;
	}
	
	//财务部查看所有生产审核过的订单
	public String findAllOrderByProduct(){
		listOrders=ordersService.findAllOrderByProduct();
		request.put("finance", listOrders);			
		return SUCCESS;
	}
	
	//生产部、财务根据订单id查询
	public String findByID(){
		orders=ordersService.findByid(orders.getOrderid());		
		request.put("waitpass", orders);
		return SUCCESS;
	}
	
	
	//生产部查看所有业务审核过的订单
		public String findAllOrders(){
			listOrders=ordersService.findAllOrderByBusiness();
			request.put("stateOrderlist", listOrders);			
			return SUCCESS;
		}
	
	
	//修改客户信息	
	public String updateCustomer(){
		
		String result=null;
		if(customerService.updateCustomer(customer)==true){
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
	
	//查看所有客户
	public String findAllCustomer(){
		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setIgnoreDefaultExcludes(false); //设置默认忽略 
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);//设置循环策略为忽略    解决json最头疼的问题 死循环
		jsonConfig.setExcludes(new String[] {"orderses"});//此处是亮点，只要将所需忽略字段加到数组中即可
		listCustomer=customerService.findByPage(Integer.parseInt(first),Integer.parseInt(max));
		String jsonStr = JSONArray.fromObject(listCustomer, jsonConfig).toString();
		try {
			inputStream = new ByteArrayInputStream(jsonStr.getBytes("utf-8")) ;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return SUCCESS;
	}
	
	//审核
	public String pass(){
		orders=ordersService.findByid(orders.getOrderid());		
		orders.setState(state);
		orders.setOrderid(orders.getOrderid());
		String result=null;
		if(ordersService.UpdateOrders(orders)==true){
			result="审核成功";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			result="审核失败";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}			
		return SUCCESS;
	}
	//取消
	public String cancel(){
//		System.out.println(state.getStateid());
//		System.out.println(orders.getOrderid());
		orders=ordersService.findByid(orders.getOrderid());		
		orders.setState(state);
		orders.setOrderid(orders.getOrderid());
		String result=null;
		if(ordersService.UpdateOrders(orders)==true){
			result="取消成功";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			result="取消失败";			
			try {
				inputStream = new ByteArrayInputStream(result.getBytes("utf-8")) ;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}			
		return SUCCESS;
	}
	
	
	//自动生成客户编号
	public String findCustomer() throws UnsupportedEncodingException{
		listCustomer=customerService.findAll();
		return SUCCESS;		
	}
	//自动生成产品编号
	public String findProduct() throws UnsupportedEncodingException{
		listProduct=productService.findAll();		 
		return SUCCESS;		
	}
	
	//查询单价和单位
	
	public String findprice(){
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setIgnoreDefaultExcludes(false); //设置默认忽略 
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);//设置循环策略为忽略    解决json最头疼的问题 死循环
		jsonConfig.setExcludes(new String[] {"types","orderses","procurements"});//此处是亮点，只要将所需忽略字段加到数组中即可
		product=productService.findByid(Integer.parseInt(productid));
		String jsonStr = JSONObject.fromObject(product, jsonConfig).toString();
		try {
			inputStream = new ByteArrayInputStream(jsonStr.getBytes("utf-8")) ;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		return SUCCESS;
	}
	//添加订单
	public String addOrder(){
		orders.setCustomer(customer);
		orders.setProduct(product);
		orders.setTypes(type);
		orders.setState(state);
		orders.setEmployeeByOriginator(employee);
		orders.setDepartment(department);
		String result=null;		
		if(ordersService.addOrders(orders)!=false){
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
		public String findOrder() throws UnsupportedEncodingException{		
			listOrders=ordersService.findByPage(Integer.parseInt(first),Integer.parseInt(max));	
			request.put("listOrders", listOrders);
			return SUCCESS;		
		}
	
					
	public OrdersService getOrdersService() {
		return ordersService;
	}


	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}


	public Orders getOrders() {
		return orders;
	}


	public void setOrders(Orders orders) {
		this.orders = orders;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public CustomerService getCustomerService() {
		return customerService;
	}


	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String getProductid() {
		return productid;
	}
	
	public void setProductid(String productid) {
		this.productid = productid;
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
	public List<Orders> getListOrders() {
		return listOrders;
	}
	public void setListOrders(List<Orders> listOrders) {
		this.listOrders = listOrders;
	}
	public Map<String, Object> getRequest() {
		return request;
	}
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}


	public Proorder getProorder() {
		return proorder;
	}


	public void setProorder(Proorder proorder) {
		this.proorder = proorder;
	}


	public ProorderService getProorderService() {
		return proorderService;
	}


	public void setProorderService(ProorderService proorderService) {
		this.proorderService = proorderService;
	}

	public List<Proorder> getListProorder() {
		return listProorder;
	}

	public void setListProorder(List<Proorder> listProorder) {
		this.listProorder = listProorder;
	}

	public Monitoring getMonitoring() {
		return monitoring;
	}

	public void setMonitoring(Monitoring monitoring) {
		this.monitoring = monitoring;
	}

	public MonitoringService getMonitoringService() {
		return monitoringService;
	}

	public void setMonitoringService(MonitoringService monitoringService) {
		this.monitoringService = monitoringService;
	}

	public List<Monitoring> getListMonitoring() {
		return listMonitoring;
	}

	public void setListMonitoring(List<Monitoring> listMonitoring) {
		this.listMonitoring = listMonitoring;
	}

	public String getEmployeeByProorderpeople() {
		return employeeByProorderpeople;
	}

	public void setEmployeeByProorderpeople(String employeeByProorderpeople) {
		this.employeeByProorderpeople = employeeByProorderpeople;
	}

	public String getEmployeeByProducter() {
		return employeeByProducter;
	}

	public void setEmployeeByProducter(String employeeByProducter) {
		this.employeeByProducter = employeeByProducter;
	}
	
	
}
