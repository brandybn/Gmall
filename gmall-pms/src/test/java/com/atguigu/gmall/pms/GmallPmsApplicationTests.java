package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springfox.documentation.annotations.ApiIgnore;

@Slf4j // 导入这个注解可以自动为当前项目注入一个log类
@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        // 测试数据库连通性
//        Product byId = productService.getById(1);
//        System.out.println(byId.toString());
        // 测试库读写分离
        Brand brand = new Brand();
        brand.setName("测试读写分离");
        brandService.save(brand); // 保存-如果从库有主库没有 那就是保存在从库，如果主从库都有，那就是保存在主库
        Brand brand1 = brandService.getById(53); // 查询-(把相同的一条记录从库给把内容修改了然后看返回的值是从库的值还是主库的值)

    }

}
