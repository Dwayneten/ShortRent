package dao;

import java.util.List;

import org.hibernate.Session;

import entity.House;
import entity.User;
import tools.HibernateSessionFactory;
import tools.Pagination;

public class UserDao extends BaseHibernateDAO{

	// �û������֤
	public boolean isExistedUser(String username, String password)
			throws Exception {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		List list = session
				.createQuery(
						"from User us where us.username=:u and us.password=:p")
				.setString("u", username).setString("p", password).list();
		System.out.println("�û���������Ϊ:" + list.size());
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession();
		return (list.size() > 0);
	}
	
	// ��ȡ�û��˺�
	public List getByUsername(String username) {
		return getSession().createQuery("from User u where u.username=:u")
				.setString("u", username).list();
	}
	
	// ����û��˺�
	public void add(User user) throws Exception {
		super.add(user);
	}
	
	// ɾ���û���Ϣ
	public void del(long id) throws Exception{
		super.del(id,User.class);
	}
	
	public void update(User user)throws Exception{
		super.update(user);
	} 
	// ��ѯ�û���Ϣ
	public User search(long id) throws Exception{
		return (User)super.get(id, User.class);
	}
	// �û���ҳ
	public Pagination getPager(int currentPageNum,int pageSize){
		return super.pagedQuery(User.class, currentPageNum, pageSize);
	}
}
