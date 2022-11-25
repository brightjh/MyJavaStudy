package top.brightzm;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/25 下午5:29
 */
public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/springboot_05_generator/src/main/java");
        gc.setAuthor("brightzm");
        gc.setOpen(false); // 生成后打开目录
        gc.setFileOverride(true); // 覆盖原先文件
        gc.setMapperName("%sDao"); // 设置数据层接口名
        gc.setIdType(IdType.ASSIGN_ID); //设置ID生成策略
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("org.mariadb.jdbc.Driver");
        dsc.setUrl("jdbc:mariadb://localhost:3306/spring_db");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("top.brightzm");
        pc.setEntity("domain"); // 实体类包名称
        pc.setMapper("dao"); // 设置数据层包名称
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("tbl_book"); // 设置当前参与生成的表名
        strategy.setTablePrefix("tbl_");
        strategy.setRestControllerStyle(true); // controller启用rest风格
        strategy.setVersionFieldName("version");
        strategy.setLogicDeleteFieldName("deleted");
        strategy.setEntityLombokModel(true);
        mpg.setStrategy(strategy);

        mpg.execute();



    }
}
