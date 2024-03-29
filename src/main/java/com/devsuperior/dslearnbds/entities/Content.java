package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson{
	static final long serialVersionUID = 1L;
	
	
	private String textContent;
	private String videoUri;
	
	
	public Content(Long id, String title, Integer position, String textContent, String videoUri) {
		super(id, title, position);
		this.textContent = textContent;
		this.videoUri = videoUri;
	}


	public String getTextContent() {
		return textContent;
	}


	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}


	public String getVideoUri() {
		return videoUri;
	}


	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
	
	
	
	

}
