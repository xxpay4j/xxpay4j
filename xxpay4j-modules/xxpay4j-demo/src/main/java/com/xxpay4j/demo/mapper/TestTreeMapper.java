package com.xxpay4j.demo.mapper;

import com.xxpay4j.common.mybatis.annotation.DataColumn;
import com.xxpay4j.common.mybatis.annotation.DataPermission;
import com.xxpay4j.common.mybatis.core.mapper.BaseMapperPlus;
import com.xxpay4j.demo.domain.TestTree;
import com.xxpay4j.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTree, TestTreeVo> {

}
