package top.lovezhangli.generate.generatedemo.demo.controller;

import top.lovezhangli.generate.generatedemo.demo.service.BannerService;
import top.lovezhangli.generate.generatedemo.demo.entity.Banner;
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
* 首页banner图 前端控制器
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/

@Slf4j
@Api(tags = "首页banner图")
@RestController
@RequestMapping("/demo/banner")
public class BannerController {
    @Autowired
    public BannerService bannerService;

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody Banner banner){
        bannerService.save(banner);
        return new Result(StatusCode.SUCCESS,"保存成功");
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable("id") Long id){
        bannerService.removeById(id);
        return new Result(StatusCode.SUCCESS,"删除成功");
    }

    @ApiOperation(value = "条件查询")
    @PostMapping("/get")
    public Result list(@RequestBody Banner banner){
        List<Banner> bannerList = bannerService.list(new QueryWrapper<>(banner));
        return new Result(StatusCode.SUCCESS,"查询成功",bannerList);
    }

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/list/{pageNum}/{pageSize}")
    public Object list(@PathVariable("pageNum")Long pageNum, @PathVariable("pageSize")Long pageSize){
        IPage<Banner> page = bannerService.page(
        new Page<>(pageNum, pageSize), null);
        return new Result(StatusCode.SUCCESS,"查询成功",new PageResult<>(page.getTotal(),page.getRecords()));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/get/{id}")
    public Result get(@PathVariable("id") Long id){
        Banner banner = bannerService.getById(id);
        return new Result(StatusCode.SUCCESS,"查询成功",banner);
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/update/{id}")
    public Result update(@PathVariable("id") Long id, @RequestBody Banner banner){
        banner.setId(id);
        bannerService.updateById(banner);
        return new Result(StatusCode.SUCCESS,"更新成功");
    }
}
