package zaydoviy.Mobileshop.service;

import java.awt.Color;
import java.util.List;

import zaydoviy.Mobileshop.entity.Vendor;

public interface VendorService {

	void save (Vendor vendor);
	List<Vendor> findAll();
	Vendor findOne(int id);
	void delete(int id);
}
