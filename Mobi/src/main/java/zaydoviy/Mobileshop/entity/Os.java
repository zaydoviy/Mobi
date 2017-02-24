package zaydoviy.Mobileshop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Os")

public class Os {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "os")
	private List<Phone> phone;
	
	
	
	
	public Os() {
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public List<Phone> getPhone() {
		return phone;
	}




	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	
}


