package Service;

import java.util.List;

import dao.ManagerDao;
import entity.Manager;

public class ManagerService {

	ManagerDao dao = new ManagerDao();
	
	public ManagerDao getDao() {
		return dao;
	}

	public void setDao(ManagerDao dao) {
		this.dao = dao;
	}

	//��¼��֤
	public  boolean loginValidated(String username, String password) throws Exception {
		return dao.isExistedManager(username, password);	
	}
	
	// �����û�����ȡ����Ա����
	public Manager getByManagername(String username) throws Exception {
		List list = dao.getByManagername(username);
		if (list.size() == 0)
			return null;
		return (Manager)list.get(0);
	}
	
	// ��ӹ���Ա
	public void  add(String username, String password) throws Exception {
		Manager manager = new Manager(username, password);
		dao.add(manager);
	}
	
	public static void main(String[] args) throws Exception {
		ManagerDao service = new ManagerDao();
		
	}
}
