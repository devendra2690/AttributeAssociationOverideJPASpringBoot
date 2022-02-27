package com.devendrabrain.orderby.version.AssociationOveride.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SecondParent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long secondParentId;

	private String address1;
	private String adddress2;

	public Long getSecondParentId() {
		return secondParentId;
	}

	public void setSecondParentId(Long secondParentId) {
		this.secondParentId = secondParentId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAdddress2() {
		return adddress2;
	}

	public void setAdddress2(String adddress2) {
		this.adddress2 = adddress2;
	}

}
