package com.ruoyi.campus.controller;


import com.alibaba.fastjson.JSON;
import com.ruoyi.campus.domain.Campus;
import com.ruoyi.campus.service.ICampusService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.CxSelect;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.security.PermissionUtils;
import com.ruoyi.common.utils.sql.SqlUtil;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 校园网
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/campus/apply")
public class CampusController extends BaseController
{
    private String prefix = "campus/apply";

    @Autowired
    private ICampusService campusService;

    @RequiresPermissions("campus:apply:list")
    @GetMapping()
    public String campus()
    {
        return prefix + "/list";
    }

    /**
     * 申请列表
     */
    @RequiresPermissions("campus:apply:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo campusApplyList(Campus campus)
    {
        startPage();
        List<Campus> list = campusService.selectCampusApplyList(campus);
        return getDataTable(list);
    }


    /**
     * 新增申请
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }
}