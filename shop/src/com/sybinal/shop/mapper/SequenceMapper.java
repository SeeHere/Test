package com.sybinal.shop.mapper;

import com.sybinal.shop.model.Sequence;
import com.sybinal.shop.model.SequenceExample;
import com.sybinal.shop.model.SequenceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int countByExample(SequenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int deleteByExample(SequenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int deleteByPrimaryKey(SequenceKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int insert(Sequence record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int insertSelective(Sequence record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	List<Sequence> selectByExample(SequenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	Sequence selectByPrimaryKey(SequenceKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int updateByExampleSelective(@Param("record") Sequence record,
			@Param("example") SequenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int updateByExample(@Param("record") Sequence record,
			@Param("example") SequenceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int updateByPrimaryKeySelective(Sequence record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sequence
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int updateByPrimaryKey(Sequence record);
}