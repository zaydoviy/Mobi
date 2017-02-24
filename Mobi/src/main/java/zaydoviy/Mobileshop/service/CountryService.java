package zaydoviy.Mobileshop.service;

import java.awt.Color;
import java.util.List;

import zaydoviy.Mobileshop.entity.Country;

public interface CountryService {

	void save (Country country);
	List<Country> findAll();
	Country findOne(int id);
	void delete(int id);
}
