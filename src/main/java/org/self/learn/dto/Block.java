package org.self.learn.dto;

public class Block {

	private String title;
	private String body;
	private String ctaLink;
	private String ctaText;
	
	public Block() {
		this.title = "";
		this.body = "";
		this.ctaLink = "";
		this.ctaText = "";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCtaLink() {
		return ctaLink;
	}

	public void setCtaLink(String ctaLink) {
		this.ctaLink = ctaLink;
	}

	public String getCtaText() {
		return ctaText;
	}

	public void setCtaText(String ctaText) {
		this.ctaText = ctaText;
	}
	
	
}
