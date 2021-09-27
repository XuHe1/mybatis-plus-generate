package top.lovezhangli.mybatis.test;

import top.lovezhangli.GenerateApp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = GenerateApp.class)
@TestPropertySource("classpath:generate.properties")
public class GenerateApplicationTests {

    @Value("${datasource.url}")
    public String dataSourceurl;
    @Value("${datasource.username}")
    public String dataSourcename;
    @Value("${datasource.databaseName}")
    public String databaseName;
    @Value("${datasource.password}")
    public String dataSourcepassword;
    @Value("${datasource.driver-class-name}")
    public String dataSourcedriver;
    @Value("${datatables.name}")
    public String tables;
    @Value("${package.parent}")
    public String packageParent;
    @Value("${datatables.isNormalize}")
    public boolean isNormalize;
    @Value("${paramy_key_type}")
    public String paramyKeyType;
    @Value("${common_package}")
    public String commonPackage;
    @Value("${table_prefix}")
    public String tablePrefix;

    @Test
    void generateMybatisPlusTest() {
        new GenerateMybatisPlus().generate(this);
    }
}