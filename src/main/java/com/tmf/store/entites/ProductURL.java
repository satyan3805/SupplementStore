package com.tmf.store.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_url")
public class ProductURL {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_url_id")
	private long productUrlId;
	
	@Column(name = "url")
	private String url;

	public long getProductUrlId() {
		return productUrlId;
	}

	public void setProductUrlId(long productUrlId) {
		this.productUrlId = productUrlId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	
	
	
}
