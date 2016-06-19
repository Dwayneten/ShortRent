package Service;

import java.util.List;

import tools.Pagination;
import dao.HouseDao;
import entity.House;

public class HouseService {
	
	HouseDao dao = new HouseDao();
	
	
	public Pagination getHousePager(int courrentPageNum,int pageSize){
		return dao.getPager(courrentPageNum,pageSize);
	}
	// �������ͨ��
	public void pass(House house) throws Exception{
		house.setState(2L);
		dao.update(house);
	}
	// ������˾ܾ�
	public void refuse(House house) throws Exception{
		house.setState(4L);
		dao.update(house);
	}
	
	// ��ӷ���
	public void addHouse(House house) throws Exception{
		dao.add(house);
	}
	// ɾ������
	public void del(long id) throws Exception{
		dao.del(id);
	}
	
	// ����id���ҳ���Ӧ�ķ�����Ϣ
	public House search(long id) throws Exception{
		return dao.search(id);
	}
}
