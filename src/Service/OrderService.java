package Service;

import dao.OrderDao;
import entity.Order;

public class OrderService {

	OrderDao dao = new OrderDao();
	// ��Ӷ�����¼
	public void  addOrder(Order order) throws Exception {
		//���ÿγ�״̬ 
		//���
		dao.add(order);
	}
	
	// ɾ��������¼
	public void delOrder(long id) throws Exception {
		dao.del(id);
	}
	
}
