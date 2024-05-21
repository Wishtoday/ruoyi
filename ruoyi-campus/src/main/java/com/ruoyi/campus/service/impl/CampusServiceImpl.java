package com.ruoyi.campus.service.impl;

import com.ruoyi.campus.domain.Campus;
import com.ruoyi.campus.mapper.CampusMapper;
import com.ruoyi.campus.service.ICampusService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公告 服务层实现
 * 
 * @author ruoyi
 * @date 2018-06-25
 */
@Service
public class CampusServiceImpl implements ICampusService
{
    @Autowired
    private CampusMapper campusMapper;

    /**
     * 查询公告信息
     * 
     * @param campusId 公告ID
     * @return 公告信息
     */
    @Override
    public Campus selectCampusApplyById(Long campusId)
    {
        return campusMapper.selectCampusApplyById(campusId);
    }

    /**
     * 查询公告列表
     * 
     * @param campus 公告信息
     * @return 公告集合
     */
    @Override
    public List<Campus> selectCampusApplyList(Campus campus)
    {
        return campusMapper.selectCampusApplyList(campus);
    }

//    /**
//     * 新增公告
//     *
//     * @param notice 公告信息
//     * @return 结果
//     */
//    @Override
//    public int insertNotice(SysNotice notice)
//    {
//        return noticeMapper.insertNotice(notice);
//    }
//
//    /**
//     * 修改公告
//     *
//     * @param notice 公告信息
//     * @return 结果
//     */
//    @Override
//    public int updateNotice(SysNotice notice)
//    {
//        return noticeMapper.updateNotice(notice);
//    }
//
//    /**
//     * 删除公告对象
//     *
//     * @param ids 需要删除的数据ID
//     * @return 结果
//     */
//    @Override
//    public int deleteNoticeByIds(String ids)
//    {
//        return noticeMapper.deleteNoticeByIds(Convert.toStrArray(ids));
//    }
}
