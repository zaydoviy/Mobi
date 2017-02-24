package zaydoviy.Mobileshop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zaydoviy.Mobileshop.dao.OsDao;
import zaydoviy.Mobileshop.dao.PhoneDao;
import zaydoviy.Mobileshop.entity.Phone;
import zaydoviy.Mobileshop.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService {

	@Autowired
	private PhoneDao phoneDao;
	
	
	public void save(Phone phone) {
		phone.getModel().toUpperCase();
		phoneDao.save(phone);
		
	}

	
	public List<Phone> findAll() {
		
		return phoneDao.findAll();
	}

	
	public Phone findOne(int id) {
		
		return phoneDao.findOne(id);
	}

	
	public void delete(int id) {
		phoneDao.delete(id);
		
	}

}
