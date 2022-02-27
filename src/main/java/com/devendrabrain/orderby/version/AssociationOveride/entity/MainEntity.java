package com.devendrabrain.orderby.version.AssociationOveride.entity;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class MainEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mainId;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "username", column = @Column(name="main_entity_username")),
		@AttributeOverride(name = "lastname", column = @Column(name="main_entity_lastname"))
	})
	@AssociationOverrides({
		@AssociationOverride(name = "secondParent",joinColumns = @JoinColumn(name="main_entity_second_parent_id"))
	})
	private ParentClass parentClass;

	public Long getMainId() {
		return mainId;
	}

	public void setMainId(Long mainId) {
		this.mainId = mainId;
	}

	public ParentClass getParentClass() {
		return parentClass;
	}

	public void setParentClass(ParentClass parentClass) {
		this.parentClass = parentClass;
	}

}
