package com.ll.service.impl;

import com.ll.dao.WorkerMapperLL;
import com.ll.dto.WorkerLL;
import com.ll.service.WorkerServiceLL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * author: 雾岛
 * Date: 2022/06/02 09:14
 * Description:
 *
 * @author - -
 */
@Service
public class WorkerServiceLLImpl implements WorkerServiceLL {
    @Autowired
    private WorkerMapperLL mapper;

    // 登陆
    @Override
    public WorkerLL workerLoginLL(String userName, String password) {
        return mapper.workerLoginLL(userName, password);
    }

    // 注册
    @Override
    public int workerAddLL(WorkerLL worker) {
        return mapper.workerAddLL(worker);
    }

    // 根据ID查询
    @Override
    public WorkerLL queryByIdWorker(Integer wid) {
        return mapper.queryByIdWorker(wid);
    }

    // 查询全部信息
    @Override
    public List<WorkerLL> workerQuery() {
        return mapper.workerQuery();
    }

    // 修改
    @Override
    public int workerUpdateLL(WorkerLL workerLL) {
        return mapper.workerUpdateLL(workerLL);
    }

    // 删除
    @Override
    public int workerDelete(Integer wid) {
        return mapper.workerDelete(wid);
    }
}
