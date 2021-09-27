package top.lovezhangli.generate.generatedemo.demo.controller;

import top.lovezhangli.generate.generatedemo.demo.service.AgentApplyInfoService;
import top.lovezhangli.generate.generatedemo.demo.entity.AgentApplyInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import top.lovezhangli.generate.common.PageResult;
import top.lovezhangli.generate.common.Result;
import top.lovezhangli.generate.common.StatusCode;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

/**
* <p>
* 代理申请信息 前端控制器
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/

@Slf4j
@Api(tags = "代理申请信息")
@RestController
@RequestMapping("/demo/agentApplyInfo")
public class AgentApplyInfoController {
    @Autowired
    public AgentApplyInfoService agentApplyInfoService;

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody AgentApplyInfo agentApplyInfo){
        agentApplyInfoService.save(agentApplyInfo);
        return new Result(StatusCode.SUCCESS,"保存成功");
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable("id") Long id){
        agentApplyInfoService.removeById(id);
        return new Result(StatusCode.SUCCESS,"删除成功");
    }

    @ApiOperation(value = "条件查询")
    @PostMapping("/get")
    public Result list(@RequestBody AgentApplyInfo agentApplyInfo){
        List<AgentApplyInfo> agentApplyInfoList = agentApplyInfoService.list(new QueryWrapper<>(agentApplyInfo));
        return new Result(StatusCode.SUCCESS,"查询成功",agentApplyInfoList);
    }

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/list/{pageNum}/{pageSize}")
    public Object list(@PathVariable("pageNum")Long pageNum, @PathVariable("pageSize")Long pageSize){
        IPage<AgentApplyInfo> page = agentApplyInfoService.page(
        new Page<>(pageNum, pageSize), null);
        return new Result(StatusCode.SUCCESS,"查询成功",new PageResult<>(page.getTotal(),page.getRecords()));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/get/{id}")
    public Result get(@PathVariable("id") Long id){
        AgentApplyInfo agentApplyInfo = agentApplyInfoService.getById(id);
        return new Result(StatusCode.SUCCESS,"查询成功",agentApplyInfo);
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/update/{id}")
    public Result update(@PathVariable("id") Long id, @RequestBody AgentApplyInfo agentApplyInfo){
        agentApplyInfo.setId(id);
        agentApplyInfoService.updateById(agentApplyInfo);
        return new Result(StatusCode.SUCCESS,"更新成功");
    }
}
