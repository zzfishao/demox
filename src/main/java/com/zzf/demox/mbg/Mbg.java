package com.zzf.demox.mbg;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;


public class Mbg {

    private String url = "jdbc:mysql://localhost:3306/mybatis";
    private String username = "root";
    private String password = "123456";

    public static void main(String[] args) {
        Mbg mbg = new Mbg();
        System.out.println(mbg.url);
        String projectPath = System.getProperty("user.dir");
        FastAutoGenerator.create(mbg.url, mbg.username, mbg.password)
                .globalConfig(builder -> {
                    builder.author("zzf") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(projectPath + "\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.zzf.demox") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath + "\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            .entityBuilder().enableLombok().build();
                })
                .execute();
    }
}
