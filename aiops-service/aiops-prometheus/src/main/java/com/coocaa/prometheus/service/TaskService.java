package com.coocaa.prometheus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coocaa.common.request.RequestBean;
import com.coocaa.prometheus.entity.Task;

/**
 * @program: intelligent_maintenance
 * @description: 定时任务调度类
 * @author: dongyang_wu
 * @create: 2019-08-01 13:45
 */
public interface TaskService extends IService<Task> {
    /**
     * 新增或更新定时任务
     */
    Boolean createQueryMetricsTask(Task task, Integer type);

    /**
     * 停止、删除或禁用定时任务
     */
    Boolean removeQueryMetricsTask(RequestBean requestbean, Integer type);

    /**
     * 启动所有定时任务
     */
    void bootstrapAllTask();

    /**
     * 根据 taskId 修改 task
     *
     * @param id
     * @param cron
     * @return
     */
    boolean updateCron(Integer id, String cron);

    /**
     * 查询全部任务信息
     *
     * @return
     */
    IPage<Task> searchAllTaskCron(Page page);
}