package cn.bdqn.j25.action;

import java.math.BigDecimal;
import java.util.Map;

import cn.bdqn.j25.pojo.Product;
import cn.bdqn.j25.pojo.Types;
import cn.bdqn.j25.service.ProductService;
import cn.bdqn.j25.service.TypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class productsAction extends ActionSupport {

	private ProductService productService;
	private TypeService typeService;
	private Integer productid;
	private String productname;
	private String productno;
	private BigDecimal productprice;
	private Integer typeid;
	private String component;
	private Integer shelflife;
	private String productmodel;
	private BigDecimal productioncost;
	private BigDecimal truckage;
	private String productremarks;
	private Map<String, Object> request = (Map) ActionContext.getContext().get("request");
	private Map<String, Object> session = ActionContext.getContext().getSession();
	
	
	
	
	
	
	
	public ProductService getProductService() {
		return productService;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public TypeService getTypeService() {
		return typeService;
	}
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductno() {
		return productno;
	}
	public void setProductno(String productno) {
		this.productno = productno;
	}
	public BigDecimal getProductprice() {
		return productprice;
	}
	public void setProductprice(BigDecimal productprice) {
		this.productprice = productprice;
	}
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public Integer getShelflife() {
		return shelflife;
	}
	public void setShelflife(Integer shelflife) {
		this.shelflife = shelflife;
	}
	public String getProductmodel() {
		return productmodel;
	}
	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}
	public BigDecimal getProductioncost() {
		return productioncost;
	}
	public void setProductioncost(BigDecimal productioncost) {
		this.productioncost = productioncost;
	}
	public BigDecimal getTruckage() {
		return truckage;
	}
	public void setTruckage(BigDecimal truckage) {
		this.truckage = truckage;
	}
	public String getProductremarks() {
		return productremarks;
	}
	public void setProductremarks(String productremarks) {
		this.productremarks = productremarks;
	}
	public String addProducts(){
		BigDecimal proCost = productioncost.add(truckage);
		session.put("proCost", proCost);
		Types types = typeService.findByid(typeid);
		Product product = new Product(types, productname, productno, component, shelflife, productmodel, productioncost, truckage, productremarks);
		productService.addOrUpdateProduct(product);
		return SUCCESS;
	}
	/*public String addProductsPrice(){
		productService.addProductsPriceById(productid, productprice);
		return SUCCESS;
	}*/
}
