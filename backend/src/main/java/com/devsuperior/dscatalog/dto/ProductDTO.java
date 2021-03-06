package com.devsuperior.dscatalog.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String description;

	private Double price;

	private String imgUrl;

	private Instant date;

	private List<CategoryDTO> categories = new ArrayList<>();

	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.description = entity.getDescription();
		this.price = entity.getPrice();
		this.imgUrl = entity.getImgUrl();
		this.date = entity.getDate();
	}

	public ProductDTO(Product entity, Set<Category> categories) {
		this(entity);
		categories.forEach(categoria -> this.categories.add(new CategoryDTO(categoria)));
	}

}
