package Service;

import java.util.List;

import tools.Pagination;
import dao.UserDao;
import entity.User;

public class UserService {
	
	UserDao dao = new UserDao();
	
	//��¼��֤
	public  boolean loginValidated(String username, String password) throws Exception {
		return dao.isExistedUser(username, password);	
	}
	
	// �����û�����ȡ�û�����
	public User getByUsername(String username) throws Exception {
		List list = dao.getByUsername(username);
		if (list.size() == 0)
			return null;
		return (User)list.get(0);
	}
	
	// ����û�
	public void  add(User user) throws Exception {
		dao.add(user);
	}
	// ɾ���û�
	public void del(long id) throws Exception{
		dao.del(id);
	}
	
	// �����û�
	public User search(long id) throws Exception{
		return dao.search(id);
	}
	
	// �����û���Ϣ
	public void update(User user) throws Exception{
		dao.update(user);
	}
	
	public static void main(String[] args) throws Exception {
		UserService service = new UserService();
		
	}
	public Pagination getUserPager(int courrentPageNum,int pageSize){
		return dao.getPager(courrentPageNum,pageSize);
	}
}
