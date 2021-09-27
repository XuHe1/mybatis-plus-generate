package top.lovezhangli.generate.generatedemo.demo.service.impl;

import top.lovezhangli.generate.generatedemo.demo.entity.Product;
import top.lovezhangli.generate.generatedemo.demo.dao.ProductMapper;
import top.lovezhangli.generate.generatedemo.demo.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* <p>
* 产品表 服务实现类
* </p>
*
* @author tanglusheng
* @since 2021-09-27
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
