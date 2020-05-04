package devs.c8h10n4o2.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="pizza_items")
public class PizzaItems {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int itemId;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_cost")
	private double itemCost;
	
	@Column(name = "item_category")
	private String category;
	
	@ManyToMany
	@JoinTable(name = "pizza_pizzaitems", //junction table name
	joinColumns =  {@JoinColumn(name = "ppi_item_id")}, //column of entity
	inverseJoinColumns = {@JoinColumn(name = "ppi_pizza_id")}) //column of the linked entity
	private Set<Pizza> pizzas = new HashSet<Pizza>();

	
	
	public PizzaItems() {
		super();
		
	}



	public PizzaItems(int itemId, String itemName, double itemCost, String category) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.category = category;
	}



	public int getItemId() {
		return itemId;
	}



	public void setItemId(int itemId) {
		this.itemId = itemId;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public double getItemCost() {
		return itemCost;
	}



	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public Set<Pizza> getPizzas() {
		return pizzas;
	}



	public void setPizzas(Set<Pizza> pizzas) {
		this.pizzas = pizzas;
	}



	@Override
	public String toString() {
		return "PizzaItems [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + ", category="
				+ category  + "]";
	}


	
	
	
	
}
