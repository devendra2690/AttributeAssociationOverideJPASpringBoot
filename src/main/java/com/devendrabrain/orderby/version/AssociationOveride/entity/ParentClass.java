package com.devendrabrain.orderby.version.AssociationOveride.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class ParentClass {

	private String username;
	private String lastname;
	private String zip;

	@OneToOne
	@JoinColumn(name = "second_parent_id")
	private SecondParent secondParent;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public SecondParent getSecondParent() {
		return secondParent;
	}

	public void setSecondParent(SecondParent secondParent) {
		this.secondParent = secondParent;
	}

}
