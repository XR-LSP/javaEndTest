package com.ll.dao;

import com.ll.dto.WorkerLL;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * author: 紫月
 * Date: 2022/06/01 21:59
 * Description:
 *
 * @author - -
 */
public interface WorkerMapperLL {
    /**
     * 登陆
     *
     * @return：返回登陆结果
     */
    @Select("select * from `ll_worker` where `username` = #{userName} and `password` = #{password}")
    WorkerLL workerLoginLL(@Param("userName") String userName, @Param("password") String password);

    /**
     * 注册账号
     *
     * @param worker：注册信息
     * @return:返回结果
     */
    @Insert("insert into `ll_worker` (`username`, `password`) values (#{userName}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "wid", keyColumn = "wid")
    int workerAddLL(WorkerLL worker);

    /**
     * 根据ID查询员工信息
     *
     * @param wid：员工ID
     * @return
     */
    @Select("select * from ll_worker where wid = #{wid}")
    WorkerLL queryByIdWorker(@Param("wid") Integer wid);

    /**
     * 查询全部
     *
     * @return：返回查询的信息
     */
    @Select("select * from `ll_worker`")
    List<WorkerLL> workerQuery();

    /**
     * 修改员工信息
     *
     * @param workerLL
     * @return
     */
    @Update("update `ll_worker` set `username` = #{userName},`password` = #{password} where `wid` = #{wid}")
    int workerUpdateLL(WorkerLL workerLL);

    /**
     * 删除员工信息
     *
     * @param wid：删除id
     * @return：返回删除结果
     */
    @Delete("delete from `ll_worker` where `wid` = #{wid}")
    int workerDelete(@Param("wid") Integer wid);
}
