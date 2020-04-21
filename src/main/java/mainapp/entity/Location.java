package mainapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location_data")

public class Location {
  @Id
  @Column(name = "Zipcode")
  private int zipcode;


  @Column(name = "City")
  private String city;

  @Column(name = "State")
   private String state;


  @Column(name="Abbreviation")
  private String abbrevation;

  @Column(name="County")
  private String county;

  @Column(name="Lat")
  private double lat;

  @Column(name="Longitude")
  private double longitude;

  public Location(){

  }
  public Location(int zipcode, String city, String state, String abbrevation, String county,
      double lat, double longitude) {
    this.zipcode = zipcode;
    this.city = city;
    this.state = state;
    this.abbrevation = abbrevation;
    this.county = county;
    this.lat = lat;
    this.longitude = longitude;
  }

  public int getZipcode() {
    return zipcode;
  }

  public void setZipcode(int zipcode) {
    this.zipcode = zipcode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getAbbrevation() {
    return abbrevation;
  }

  public void setAbbrevation(String abbrevation) {
    this.abbrevation = abbrevation;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  @Override
  public String toString() {
    return "Location{" +
        "zipcode=" + zipcode +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", abbrevation='" + abbrevation + '\'' +
        ", county='" + county + '\'' +
        ", lat=" + lat +
        ", longitude=" + longitude +
        '}';
  }
}
