package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import tools.HibernateSessionFactory;
import entity.DealOrder;

public class DealOrderDao extends BaseHibernateDAO{

	// ����Ԥ����¼
	public void add(DealOrder dealorder) throws Exception{
		super.add(dealorder);
	}
	
	// ɾ��Ԥ����¼
	public void del(long id) throws Exception{
		super.del(id, DealOrder.class);
	}
	
	// ����id��ȡԤ����¼
	public DealOrder get(long id) throws Exception {
		return (DealOrder) super.get(id, DealOrder.class);
	}
	
	// ��ȡ����Ԥ����¼
	public List<DealOrder> getAll() throws Exception {
		return super.getAll(DealOrder.class);
	}
}
