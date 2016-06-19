package dao;
import java.util.List;

import org.hibernate.Session;

import entity.Manager;
import tools.HibernateSessionFactory;

public class ManagerDao extends BaseHibernateDAO{

	// ��֤����Ա���
	public boolean isExistedManager(String username,String password)
	throws Exception{
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		// System.out.println("no");
		List list = session.createQuery("from Manager ma where ma.username=:u and ma.password=:p")
				.setString("u", username).setString("p", password).list();
		
		System.out.println("����Ա��������Ϊ:" + list.size());
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
		
		return (list.size() > 0);
	}
	
	// ��ӹ���Ա�˺�
	public void add(Manager manager) throws Exception {
		super.add(manager);
	}
	// ��ȡ����Ա�˺�
	public List getByManagername(String username) {
		return getSession().createQuery("from Manager m where m.username=:u")
				.setString("u", username).list();
	}
}
