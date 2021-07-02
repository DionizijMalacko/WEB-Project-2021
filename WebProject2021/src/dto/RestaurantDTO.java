package dto;

public class RestaurantDTO {
	
	private String name;
	
	private String type;
	
	private String open;
	
	private String city;
	
	private String country;
	
	private Double rating;

	
	public RestaurantDTO() {
		super();
	}



	public RestaurantDTO(String name, String type, String open, String city, String country, Double rating) {
		super();
		this.name = name;
		this.type = type;
		this.open = open;
		this.city = city;
		this.country = country;
		this.rating = rating;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getOpen() {
		return open;
	}


	public void setOpen(String open) {
		this.open = open;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Double getRating() {
		return rating;
	}


	public void setRating(Double rating) {
		this.rating = rating;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
