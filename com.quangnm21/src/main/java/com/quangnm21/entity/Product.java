package com.quangnm21.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product  implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private BigDecimal prices;
    @ManyToOne(fetch = FetchType.LAZY,  targetEntity = Category.class)
    @JoinColumn(name = "cate_id", nullable = false)
    private Category categories;
    private String image;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "products")
    private Set<ProductImage> product_image = new HashSet<ProductImage>(0);

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getPrices() {
        return prices;
    }
    public void setPrices(BigDecimal prices) {
        this.prices = prices;
    }

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Category getCategories() {
		return categories;
	}
	public void setCategories(Category categories) {
		this.categories = categories;
	}
	public Set<ProductImage> getProduct_image() {
		return product_image;
	}
	public void setProduct_image(Set<ProductImage> product_image) {
		this.product_image = product_image;
	}


}
