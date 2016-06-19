package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import entity.House;
import tools.HibernateSessionFactory;
import tools.Pagination;

public class HouseDao extends BaseHibernateDAO{

	
	// ����������Ϣ����ͨ����ˣ�
	public void add(House house) throws Exception{
		house.setState(3L);
		super.add(house);
	}
	
	// ɾ��������Ϣ
	public void del(long id) throws Exception{
		super.del(id,House.class);
	}
	
	// ���·�����Ϣ
	public void update(House house) throws Exception{
		super.update(house);
	}
	
	// ���ݾ�����Ϣ
	public House search(long id) throws Exception{
		return (House)super.get(id, House.class);
	}
	
	public Pagination getPager(int currentPageNum,int pageSize){
		return super.pagedQuery(House.class, currentPageNum, pageSize);
	}
}
