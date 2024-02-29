package package2.com;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="chandan2")
public class Model {

private	String place;
private	String famous;
private int amount;

@Id
private Integer id;
public Integer getId() {
return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getFamous() {
	return famous;
}
public void setFamous(String famous) {
	this.famous = famous;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

	

	}


