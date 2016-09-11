package cn.crap.controller;

import cn.crap.framework.base.BaseController;
import cn.crap.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 前后台共用的Controller
 *
 * @author Ehsan
 */
@Controller
public class DatatestController extends BaseController<User> {


    /**
     * @return
     */
    @RequestMapping("datatest.do")
    public String index() {
        return "resources/html/datatest/index.html";
    }
    /**
     * @return
     */
    @RequestMapping("ztree.do")
    public String ztree() {
        return "resources/html/datatest/ztree.html";
    }
}
