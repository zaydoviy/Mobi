package zaydoviy.Mobileshop.service;

import java.awt.Color;
import java.util.List;

import zaydoviy.Mobileshop.entity.Phone;

public interface PhoneService {

	
	void save (Phone phone);
	List<Phone> findAll();
	Phone findOne(int id);
	void delete(int id);
}
