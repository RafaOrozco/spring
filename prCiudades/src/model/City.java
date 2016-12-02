package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the city database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="City.findAll", query="SELECT c FROM City c"),
@NamedQuery(name="citiesByCapital", query="SELECT c.name FROM City c, Country con WHERE con.capital = :cap ")
})
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String district;

	private String name;

	private int population;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="CountryCode")
	private Country country;

	public City() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return this.population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}