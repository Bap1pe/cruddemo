# 后端开发初期考核项目 (cruddemo)


- Java 17
- Spring Boot 3.2.0
- MyBatis
- MySQL

##接口说明 (RESTful 风格)
- `GET /users` : 查询所有用户列表
- `GET /users/{id}` : 根据 ID 查询单个用户
- `POST /users` : 新增用户（请求体 JSON）
- `PUT /users` : 修改用户（请求体 JSON）
- `DELETE /users/{id}` : 删除用户

## 数据库脚本
请先执行根目录下的 `init.sql` 文件创建数据库和表。

## 运行方式
1. 修改 `src/main/resources/application.properties` 中的数据库密码。
2. 运行 `CruddemoApplication`。