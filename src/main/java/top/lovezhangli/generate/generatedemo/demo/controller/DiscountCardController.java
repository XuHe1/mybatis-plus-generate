package top.lovezhangli.generate.generatedemo.demo.controller;

import top.lovezhangli.generate.generatedemo.demo.service.DiscountCardService;
import top.lovezhangli.generate.generatedemo.demo.entity.DiscountCard;
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
* 折扣省份-卡种 前端控制器
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/

@Slf4j
@Api(tags = "折扣省份-卡种")
@RestController
@RequestMapping("/demo/discountCard")
public class DiscountCardController {
    @Autowired
    public DiscountCardService discountCardService;

    @ApiOperation(value = "新增")
    @PostMapping("/save")
    public Result save(@RequestBody DiscountCard discountCard){
        discountCardService.save(discountCard);
        return new Result(StatusCode.SUCCESS,"保存成功");
    }

    @ApiOperation(value = "根据id删除")
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable("id") Long id){
        discountCardService.removeById(id);
        return new Result(StatusCode.SUCCESS,"删除成功");
    }

    @ApiOperation(value = "条件查询")
    @PostMapping("/get")
    public Result list(@RequestBody DiscountCard discountCard){
        List<DiscountCard> discountCardList = discountCardService.list(new QueryWrapper<>(discountCard));
        return new Result(StatusCode.SUCCESS,"查询成功",discountCardList);
    }

    @ApiOperation(value = "列表（分页）")
    @GetMapping("/list/{pageNum}/{pageSize}")
    public Object list(@PathVariable("pageNum")Long pageNum, @PathVariable("pageSize")Long pageSize){
        IPage<DiscountCard> page = discountCardService.page(
        new Page<>(pageNum, pageSize), null);
        return new Result(StatusCode.SUCCESS,"查询成功",new PageResult<>(page.getTotal(),page.getRecords()));
    }

    @ApiOperation(value = "详情")
    @GetMapping("/get/{id}")
    public Result get(@PathVariable("id") Long id){
        DiscountCard discountCard = discountCardService.getById(id);
        return new Result(StatusCode.SUCCESS,"查询成功",discountCard);
    }

    @ApiOperation(value = "根据id修改")
    @PostMapping("/update/{id}")
    public Result update(@PathVariable("id") Long id, @RequestBody DiscountCard discountCard){
        discountCard.setId(id);
        discountCardService.updateById(discountCard);
        return new Result(StatusCode.SUCCESS,"更新成功");
    }
}
