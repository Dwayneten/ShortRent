package controller;

import java.util.List;

import tools.Pagination;
import Service.HouseService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import common.WebConstant;
import entity.House;

public class HouseAction extends ActionSupport{

	House house = new House();
	long pId;
	long hId;
	HouseService hs = new HouseService();
	
	// ��ҳ
	public String showPage() throws Exception{
		
		Pagination pager = hs.getHousePager((int)pId, WebConstant.PAGE_SIZE);
		ActionContext.getContext().put("pager", pager);
		System.out.println("House showPage");
		return SUCCESS;
	}
	
	// �������ͨ��
	public String pass() throws Exception{
		house = hs.search(hId);
		hs.pass(house);
		System.out.println("House pass");
		return SUCCESS;
	}
	
	// ������˾ܾ�
	public String refuse() throws Exception{
		house = hs.search(hId);
		hs.refuse(house);
		System.out.println("House refuse");
		return SUCCESS;
	}
	
	// ��ӷ�����Ϣ
	public String add() throws Exception{
		hs.addHouse(house);
		System.out.println("House add");
		return SUCCESS;
	}
	// ɾ��������Ϣ
	public String del() throws Exception{
		hs.del(hId);
		System.out.println("House del");
		return SUCCESS;
	}
	
	//��ʾ���ݾ�����Ϣ
	public String detail() throws Exception{
		house = hs.search(hId);
		if(house == null)
			return ERROR;
		else{
			ActionContext.getContext().put("pager", house);
			return SUCCESS;
		}
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public HouseService getHs() {
		return hs;
	}
	public void setHs(HouseService hs) {
		this.hs = hs;
	}

	public long gethId() {
		return hId;
	}

	public void sethId(long hId) {
		this.hId = hId;
	}
	
}
