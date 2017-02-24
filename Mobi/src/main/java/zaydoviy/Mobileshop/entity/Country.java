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
	@Table(name="Country")

	public class Country {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		private String country;
		
		@OneToMany(mappedBy = "country")
		private List<Phone> phone;
		
		
		
		public Country() {
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getCountry() {
			return country;
		}



		public void setCountry(String country) {
			this.country = country;
		}



		public List<Phone> getPhone() {
			return phone;
		}



		public void setPhone(List<Phone> phone) {
			this.phone = phone;
		}
		
	}


