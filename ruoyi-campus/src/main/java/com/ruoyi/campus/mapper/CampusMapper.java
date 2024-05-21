package com.ruoyi.campus.mapper;


import com.ruoyi.campus.domain.Campus;

import java.util.List;

/**
 * 公告 数据层
 * 
 * @author ruoyi
 */
public interface CampusMapper
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
    public List<Campus> selectCampusApplyList(Campus campus);

//    /**
//     * 新增公告
//     *
//     * @param notice 公告信息
//     * @return 结果
//     */
//    public int insertNotice(Campus notice);
//
//    /**
//     * 修改公告
//     *
//     * @param notice 公告信息
//     * @return 结果
//     */
//    public int updateNotice(Campus notice);
//
//    /**
//     * 批量删除公告
//     *
//     * @param noticeIds 需要删除的数据ID
//     * @return 结果
//     */
//    public int deleteNoticeByIds(String[] noticeIds);
}