package com.sybinal.shop.mapper;

import com.sybinal.shop.model.ProductOption;
import com.sybinal.shop.model.ProductOptionExample;
import com.sybinal.shop.model.ProductOptionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductOptionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	long countByExample(ProductOptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	int deleteByExample(ProductOptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	int deleteByPrimaryKey(ProductOptionKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	int insert(ProductOption record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	int insertSelective(ProductOption record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	List<ProductOption> selectByExample(ProductOptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	ProductOption selectByPrimaryKey(ProductOptionKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	int updateByExampleSelective(@Param("record") ProductOption record, @Param("example") ProductOptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	int updateByExample(@Param("record") ProductOption record, @Param("example") ProductOptionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	int updateByPrimaryKeySelective(ProductOption record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product_option
	 * @mbg.generated  Fri Oct 21 14:41:07 CST 2016
	 */
	int updateByPrimaryKey(ProductOption record);

	int selectCountByOptionValueIds(@Param("optionValueIds") String optionValueIds);
}