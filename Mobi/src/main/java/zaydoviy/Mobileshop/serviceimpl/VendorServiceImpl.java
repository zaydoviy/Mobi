package zaydoviy.Mobileshop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zaydoviy.Mobileshop.dao.CountryDao;
import zaydoviy.Mobileshop.dao.VendorDao;
import zaydoviy.Mobileshop.entity.Vendor;
import zaydoviy.Mobileshop.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDao vendorDao;
	
	public void save(Vendor vendor) {
		vendor.getName().toUpperCase();
		vendorDao.save(vendor);
		
	}
	
	public List<Vendor> findAll() {
		
		return vendorDao.findAll();
	}

	public Vendor findOne(int id) {
		
		return vendorDao.findOne(id);
	}

	public void delete(int id) {
		vendorDao.delete(id);
		
	}

}
