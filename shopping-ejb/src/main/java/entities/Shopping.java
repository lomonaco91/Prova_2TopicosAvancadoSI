package entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "shopping_order")
@SequenceGenerator(name = "seq_shopping_order", 
sequenceName = "seq_shopping_order", 
allocationSize = 1)

public class Shopping {
	
	@Id
	@GeneratedValue(generator = "seq_shopping_order", strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String description;
	private Timestamp orderTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
}