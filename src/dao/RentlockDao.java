package dao;

import entity.RentLock;

public class RentlockDao extends BaseHibernateDAO{

	// ���ӳ������
	public void add(RentLock rentlock) throws Exception{
		super.add(rentlock);
	}
	
	//ɾ���������
	public void del(long id) throws Exception{
		super.del(id, RentLock.class);
	}
	
}
