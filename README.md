# demox
Login&amp;SignUp

项目地址：http://47.113.193.173:9023/
1. springboot作框架
2. mybatis-plus调用mysql数据库
3. 前端使用axios进行传参
4. 使用阿里云ECS服务器进行搭建
5. 注册时如果输入已经存在的用户名会提示错误
6. 登录时如果输入不存在的用户名会会提示错误，密码输入错误也会报错

改进方向：session、springcloud、docker

---
Update(2022.06.29)
- 采用BCrypt进行密码的加密，将加密后的字符串保存在数据库中：

![image](https://user-images.githubusercontent.com/62491673/176333126-b8d4be03-eb77-44ff-b6b5-e1436366a53b.png)

- 原密码：

![image](https://user-images.githubusercontent.com/62491673/176333188-0d010bc2-653d-4f91-a1ab-ee698c4e2c9b.png)
