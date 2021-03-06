package com.customizabledatasearch.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SearchLabel {
	
	private Long id;
	private String name;
	private String content;
	
	private Userint userint;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@OneToOne
	public Userint getUserint() {
		return userint;
	}

	public void setUserint(Userint userint) {
		this.userint = userint;
	}

}
