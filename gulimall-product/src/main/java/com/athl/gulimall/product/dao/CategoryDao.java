package com.athl.gulimall.product.dao;

import com.athl.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 15:28:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
