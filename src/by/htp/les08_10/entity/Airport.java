package by.htp.les08_10.entity;

import java.util.ArrayList;
import java.util.List;

public class Airport {

	private String name;
	private List<Airline> Airlines;

	public Airport(String name) {
		this.name = name;
		Airlines = new ArrayList<Airline>();
	}

	public Airport(String name, List<Airline> Airlines) {
		this.name = name;
		this.Airlines = Airlines;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Airline> getAirlines() {
		return Airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		Airlines = airlines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Airlines == null) ? 0 : Airlines.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		if (Airlines == null) {
			if (other.Airlines != null)
				return false;
		} else if (!Airlines.equals(other.Airlines))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", Airlines=" + Airlines + "]";
	}

}
