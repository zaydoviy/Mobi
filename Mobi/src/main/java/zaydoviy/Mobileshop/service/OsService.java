package zaydoviy.Mobileshop.service;

import java.awt.Color;
import java.util.List;

import zaydoviy.Mobileshop.entity.Os;

public interface OsService {

	void save (Os os);
	List<Os> findAll();
	Os findOne(int id);
	void delete(int id);
}
