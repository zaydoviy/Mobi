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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Color")
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String color;

	@ManyToMany
	@JoinTable(name = "phoneColor", joinColumns = @JoinColumn(name = "idcolor"), inverseJoinColumns = @JoinColumn(name = "idphone"))
	private List<Phone> phones;

	public Color() {
	}

	public Color(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void addAttribute(String string, List<Color> findAll) {
		// TODO Auto-generated method stub
		
	}

}
