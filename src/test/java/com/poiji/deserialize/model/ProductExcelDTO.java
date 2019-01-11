package com.poiji.deserialize.model;

import java.io.Serializable;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

@SuppressWarnings("serial")
public class ProductExcelDTO implements Serializable {

	@ExcelRow
	// @JsonProperty("row_index")
	private int rowIndex;

	@ExcelCell(0)
	// @JsonProperty("sku")
	private String sku;

	@ExcelCell(1)
	// @JsonProperty("description")
	private String description;

	@ExcelCell(2)
	// @JsonProperty("price")
	private String price;

	@ExcelCellName("COLOR")
	// @JsonProperty("color")
	private String color;

	@ExcelCellName("TALLE")
	// @JsonProperty("size")
	private String size;

	@ExcelCellName("STOCK")
	// @JsonProperty("stock")
	private String stock;

	public ProductExcelDTO() {

	}

	@Override
	public String toString() {
		return "ProductExcelDTO {" + " rowIndex=" + rowIndex + ", sku=" + sku + "'" + ", description='" + description
				+ "'" + ", price='" + price + "'" + ", color='" + color + "'" + ", size='" + size + "'" + ", stock='"
				+ stock + "'" + '}';
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String descripcion) {
		this.description = descripcion;
	}

	public String getColors() {
		return color;
	}

	public void setColors(String colors) {
		this.color = colors;
	}

	public String getSizes() {
		return size;
	}

	public void setSizes(String sizes) {
		this.size = sizes;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
