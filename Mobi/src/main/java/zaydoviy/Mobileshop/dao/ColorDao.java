package zaydoviy.Mobileshop.dao;

import zaydoviy.Mobileshop.dao.ColorDao;
import zaydoviy.Mobileshop.entity.Color;



import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorDao extends JpaRepository<Color, Integer>  {
	

}
