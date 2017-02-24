package zaydoviy.Mobileshop.service;

 
import java.util.List;

import zaydoviy.Mobileshop.entity.Color;

public interface ColorService {

	void save (Color color);
	List<Color> findAll();
	Color findOne(int id);
	void delete(int id);
}
