package com.sybinal.shop.model;

public class ProductOption extends ProductOptionKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_option.quantity
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	private Integer quantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_option.price
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	private Integer price;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_option.quantity
	 * @return  the value of product_option.quantity
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_option.quantity
	 * @param quantity  the value for product_option.quantity
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_option.price
	 * @return  the value of product_option.price
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_option.price
	 * @param price  the value for product_option.price
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
}