package com.sybinal.shop.model;

public class SequenceKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sequence.type_code
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String typeCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sequence.counter_key
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String counterKey;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sequence.type_code
	 * @return  the value of sequence.type_code
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sequence.type_code
	 * @param typeCode  the value for sequence.type_code
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sequence.counter_key
	 * @return  the value of sequence.counter_key
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getCounterKey() {
		return counterKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sequence.counter_key
	 * @param counterKey  the value for sequence.counter_key
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setCounterKey(String counterKey) {
		this.counterKey = counterKey;
	}
}