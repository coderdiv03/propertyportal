package com.example.propertyportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="aboutus")
public class Aboutus {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="aid")
	private int aid;
	
	@Column(name="heading")
	private String heading;
	
	@Column(name="para")
	private String para;
	
	 public Aboutus() {}
	 
    public Aboutus(String heading, String para) {
		super();
		this.heading = heading;
		this.para = para;
	}

	@Override
	public String toString() {
		return "Aboutus [id=" + aid + ", heading=" + heading + ", para=" + para + "]";
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}
