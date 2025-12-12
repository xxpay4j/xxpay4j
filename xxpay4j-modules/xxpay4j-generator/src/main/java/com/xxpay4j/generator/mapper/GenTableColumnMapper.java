package com.xxpay4j.generator.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.xxpay4j.common.mybatis.core.mapper.BaseMapperPlus;
import com.xxpay4j.generator.domain.GenTableColumn;

/**
 * 业务字段 数据层
 *
 * @author Lion Li
 */
@InterceptorIgnore(dataPermission = "true", tenantLine = "true")
public interface GenTableColumnMapper extends BaseMapperPlus<GenTableColumn, GenTableColumn> {

}
