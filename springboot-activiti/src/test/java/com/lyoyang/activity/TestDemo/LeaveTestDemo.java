package com.lyoyang.activity.TestDemo;

import com.lyoyang.activity.BaseTest;
import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * @author: Brian
 * @Date: 2020/5/13 16:06
 * @Description:
 */
public class LeaveTestDemo extends BaseTest {

    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private FormService formService;
    @Autowired
    private IdentityService identityService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;



    @Test
    public void leaveTest() {
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().deploymentId("1").singleResult();
        ProcessInstance processInstance = runtimeService.startProcessInstanceById(processDefinition.getId(), processDefinition.getKey());
        List<Task> tomTask = taskService.createTaskQuery().taskCandidateOrAssigned("部门经理").orderByTaskCreateTime().desc().list();
        System.out.println(tomTask);
        HashMap<String, Object> confirm = new HashMap<>();
        confirm.put("deptleaderapprove", "true");
        taskService.complete(tomTask.get(0).getId(), confirm);
    }





}
