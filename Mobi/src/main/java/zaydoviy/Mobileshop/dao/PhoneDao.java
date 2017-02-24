package zaydoviy.Mobileshop.dao;

import java.awt.Color;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import zaydoviy.Mobileshop.entity.Phone;

public interface PhoneDao  extends JpaRepository<Phone, Integer> {

	
}
