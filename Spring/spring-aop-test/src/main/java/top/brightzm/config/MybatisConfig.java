package top.brightzm.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/3 下午10:26
 */
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();

        // 类别名扫描
        ssfb.setTypeAliasesPackage("top.brightzm.domain");

        // 设置数据源
        ssfb.setDataSource(dataSource);

        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("top.brightzm.dao");
        return msc;
    }

}
