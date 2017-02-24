package zaydoviy.Mobileshop.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import zaydoviy.Mobileshop.entity.Country;

public interface CountryDao extends JpaRepository<Country, Integer> {

	
}
