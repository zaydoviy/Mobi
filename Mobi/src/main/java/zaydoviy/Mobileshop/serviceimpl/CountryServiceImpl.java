package zaydoviy.Mobileshop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zaydoviy.Mobileshop.dao.CountryDao;
import zaydoviy.Mobileshop.entity.Country;
import zaydoviy.Mobileshop.service.CountryService;


@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDao countryDao;
	
	public void save(Country country) {
		country.getCountry().toUpperCase();
		countryDao.save(country);
		
	}

	public List<Country> findAll() {
		
		return countryDao.findAll();
	}

	
	public Country findOne(int id) {
		
		return countryDao.findOne(id);
	}

	
	public void delete(int id) {
		countryDao.delete(id);
		
	}

}
