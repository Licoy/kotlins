package cn.licoy.controller


import cn.licoy.mapper.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
/**
 * @author 刘杰
 * @version 1.0 /
 */
@Controller
open class BeginController{

    @Autowired
    private var userMapper : UserMapper ?=null

    @GetMapping("/begin")
    fun begin():String{
        return "index"
    }

    @GetMapping("/user/{id}")
    fun findUserById(@PathVariable(value = "id") id: Int?, map: ModelMap): String {
        val user = userMapper?.selectById(id)
        map.addAttribute("user", user)
        return "user"
    }
}