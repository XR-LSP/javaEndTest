package com.ll.service;

import com.ll.dto.WorkerLL;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * author: 雾岛
 * Date: 2022/06/01 22:00
 * Description:
 *
 * @author - -
 */
public interface WorkerServiceLL {
    /**
     * 登陆
     *
     * @return：返回登陆结果
     */
    WorkerLL workerLoginLL(String userName, String password);

    /**
     * 注册账号
     *
     * @param worker：注册信息
     * @return:返回结果
     */
    int workerAddLL(WorkerLL worker);

    /**
     * 根据ID查询员工信息
     *
     * @param wid：员工ID
     * @return
     */
    WorkerLL queryByIdWorker(@Param("wid") Integer wid);

    /**
     * 查询全部
     *
     * @return：返回查询的信息
     */
    List<WorkerLL> workerQuery();

    /**
     * 修改信息
     *
     * @param workerLL:员工信息
     * @return
     */
    int workerUpdateLL(WorkerLL workerLL);

    /**
     * 删除员工信息
     *
     * @param wid：删除id
     * @return：返回删除结果
     */
    int workerDelete(Integer wid);
}
