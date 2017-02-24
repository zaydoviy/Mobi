package zaydoviy.Mobileshop.entity;

	import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="Phones")

	public class Phone {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		
		@ManyToOne
		private Vendor vendor;
		private String model;
		@ManyToOne
		private Os os;
		private double display;
		private double camera;
		private int memory;
		@ManyToOne
		private Country country;
		
		@ManyToMany
		@JoinTable (name = "phoneColor", 
		joinColumns=@JoinColumn(name = "idphone"), 
		inverseJoinColumns = @JoinColumn(name = "idcolor"))
		private List<Color> color;
		
		
		
		public Phone() {
		}



		public String getModel() {
			return model;
		}



		public void setModel(String model) {
			this.model = model;
		}



		
		
	}
