package com.ruoyi.campus.service;

import com.ruoyi.campus.domain.Campus;

import java.util.List;

/**
 * 校园网 服务层
 * 
 * @author zhuxiying
 */
public interface ICampusService
{
    /**
     * 查询公告信息
     * 
     * @param campusId 公告ID
     * @return 公告信息
     */
    public Campus selectCampusApplyById(Long campusId);

    /**
     * 查询公告列表
     * 
     * @param campus 公告信息
     * @return 公告集合
     */
    public List <Campus> selectCampusApplyList(Campus campus);

//    /**
//     * 新增公告
//     *
//     * @param notice 公告信息
//     * @return 结果
//     */
//    public int insertCampusApply(Campus campus);
//
//    /**
//     * 修改公告
//     *
//     * @param notice 公告信息
//     * @return 结果
//     */
//    public int updateCampusApply(SysNotice notice);
//
//    /**
//     * 删除公告信息
//     *
//     * @param ids 需要删除的数据ID
//     * @return 结果
//     */
//    public int deleteCampusApplyByIds(String ids);
}
