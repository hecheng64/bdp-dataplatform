package com.platform.mobile.dao;

import com.platform.mobile.domain.CartProduct;
import com.platform.mobile.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 前台系统自定义商品Dao
 * Created by wulinhao on 2019/8/2.
 */
public interface PortalProductDao {
    CartProduct getCartProduct(@Param("id") Long id);

    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);
}