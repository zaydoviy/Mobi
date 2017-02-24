package zaydoviy.Mobileshop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zaydoviy.Mobileshop.dao.ColorDao;
import zaydoviy.Mobileshop.entity.Color;
import zaydoviy.Mobileshop.service.ColorService;



@Service
public class ColorServiceImpl implements ColorService {

	@Autowired
	private ColorDao colorDao;
	
	public void save(Color color) {
		color.getColor().toUpperCase();
		colorDao.save(color);
		
	}

	public List<Color> findAll() {
		
		return colorDao.findAll();
	}

	
	public Color findOne(int id) {
		
		return colorDao.findOne(id);
	}

	
	public void delete(int id) {
		colorDao.delete(id);
		
	}

	
}