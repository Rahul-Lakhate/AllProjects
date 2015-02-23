package com.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * State generated by MyEclipse - Hibernate Tools
 */

public class State  implements java.io.Serializable {


    // Fields    

     private Integer stateid;
     private Country country;
     private String statename;
   
     private Set cities = new HashSet(0);


    // Constructors

    /** default constructor */
    public State() {
    }

	/** minimal constructor */
    public State(Integer stateid, Country country, String statename) {
        this.stateid = stateid;
        this.country = country;
        this.statename = statename;
    }
    
   

   
    // Property accessors

    public Integer getStateid() {
        return this.stateid;
    }
    
    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStatename() {
        return this.statename;
    }
    
    public void setStatename(String statename) {
        this.statename = statename;
    }

    

    public Set getCities() {
        return this.cities;
    }
    
    public void setCities(Set cities) {
        this.cities = cities;
    }
   








}