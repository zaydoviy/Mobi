package zaydoviy.Mobileshop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zaydoviy.Mobileshop.dao.ColorDao;
import zaydoviy.Mobileshop.dao.OsDao;
import zaydoviy.Mobileshop.entity.Os;
import zaydoviy.Mobileshop.service.OsService;


@Service
public class OsServiceImpl implements OsService {

	@Autowired
	private OsDao osDao;

	public void save(Os os) {
		os.getName().toUpperCase();
		osDao.save(os);

	}

	public List<Os> findAll() {
		
		return osDao.findAll();
	}

	public Os findOne(int id) {
		
		return osDao.findOne(id);
	}

	public void delete(int id) {
		osDao.delete(id);

	}

}
