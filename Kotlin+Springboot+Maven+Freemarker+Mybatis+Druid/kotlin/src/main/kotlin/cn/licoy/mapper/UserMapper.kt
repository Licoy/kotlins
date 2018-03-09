package cn.licoy.mapper

import cn.licoy.bean.User
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

/**
 * @author 刘杰
 * *
 * @version 1.0 /
 */
@Mapper
@Repository
interface UserMapper {
    /**
     * 根据ID查询用户
     */
    fun selectById(id: Int?): User
}
