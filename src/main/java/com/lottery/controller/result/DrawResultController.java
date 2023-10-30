package com.lottery.controller.result;

import com.lottery.service.result.DrawResultService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/draw/result")
public class DrawResultController {

    @Resource
    private DrawResultService drawResultService;

    /**
     * 拉取数据
     * @return
     */
    @GetMapping("/push")
    public boolean push() {
        return drawResultService.push();
    }

}
