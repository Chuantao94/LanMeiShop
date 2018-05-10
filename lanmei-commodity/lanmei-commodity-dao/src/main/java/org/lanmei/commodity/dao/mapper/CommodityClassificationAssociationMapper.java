package org.lanmei.commodity.dao.mapper;

import java.util.List;
import org.lanmei.commodity.dao.model.CommodityClassificationAssociation;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityClassificationAssociationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_classification_association
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer associationId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_classification_association
	 * @mbg.generated
	 */
	int insert(CommodityClassificationAssociation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_classification_association
	 * @mbg.generated
	 */
	CommodityClassificationAssociation selectByPrimaryKey(Integer associationId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_classification_association
	 * @mbg.generated
	 */
	List<CommodityClassificationAssociation> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table commodity_classification_association
	 * @mbg.generated
	 */
	int updateByPrimaryKey(CommodityClassificationAssociation record);
}