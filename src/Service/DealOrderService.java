package Service;

import java.util.List;

import dao.DealOrderDao;
import entity.DealOrder;

public class DealOrderService {

	DealOrderDao dao = new DealOrderDao();
	
	// ���Ԥ����¼
	public void  addDealOrder(DealOrder course) throws Exception {
		dao.add(course);
	}
	// ɾ��Ԥ����¼
	public void delDealOrder(long id) throws Exception {
		dao.del(id);
	}
	
	// ��ȡȫ��Ԥ����¼
	public List<DealOrder> getAll() throws Exception {
		return dao.getAll();
	}
	// ��Id��ȡԤ����¼
	public DealOrder getDealOrder(long DealOrderId) throws Exception{
		return dao.get(DealOrderId);
	}
}
