package com.ll.action;

import com.ll.dto.WorkerLL;
import com.ll.service.WorkerServiceLL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * author: 雾岛
 * Date: 2022/06/01 21:58
 * Description:
 *
 * @author - -
 */
@Controller
@RequestMapping("/worker")
public class WorkerActionLL {
    @Autowired
    private WorkerServiceLL workerService;

    // 登陆
    @RequestMapping(method = RequestMethod.POST)
    public String login(String userName, String password) {
        return workerService.workerLoginLL(userName, password) != null ? "redirect:/worker" : "login";
    }

    // 注册
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(WorkerLL worker) {
        int i = workerService.workerAddLL(worker);
        System.out.print(i != 0 ? "注册成功" : "注册失败");
        return "redirect:/worker";
    }

    // 展示全部
    @RequestMapping(method = RequestMethod.GET)
    public String queryWorker(Model model) {
        model.addAttribute("list", workerService.workerQuery());
        return "list";
    }

    // 跳转到修改页面
    @RequestMapping(value = "/toUpdatePaper/{wid}", method = RequestMethod.GET)
    public String toUpdatePaper(@PathVariable("wid") int id, Model model) {
        WorkerLL worker = workerService.queryByIdWorker(id);
        model.addAttribute("worker", worker);
        return "update";
    }

    // 修改
    @RequestMapping(value = "updateByIdWorker", method = RequestMethod.POST)
    public String updateByIdWorker(WorkerLL worker) {
        int i = workerService.workerUpdateLL(worker);
        System.out.print(i != 0 ? "修改成功" : "修改失败");
        return "redirect:/worker";
    }

    // 删除
    @RequestMapping(value = "/deleteById/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteByIdWorker(@PathVariable Integer id) {
        int i = workerService.workerDelete(id);
        System.out.print(i != 0 ? "删除成功" : "删除失败");
        return "redirect:/worker";
    }
}
