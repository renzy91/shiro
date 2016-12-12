/**
	初始化用户
  密码为:123456
  盐:SXBL
  散列次数:1024
*/
insert into t_user values ('1', 'zhangsan', 'e4e58bfb852e32b34f910848089aa688','SXBL');
insert into t_user values ('2', 'lisi', 'e4e58bfb852e32b34f910848089aa688', 'SXBL');

/**
   初始化角色
   角色 admin  user  super
 */
insert into t_role values ('1','admin');
insert into t_role values ('2','product');
insert into t_role values ('3','user');

/**
  初始化角色与用户之间的关系
   zhangsan    user  product
   lisi        admin  
 */
insert into t_user_role values('1','1','2');
insert into t_user_role values('2','1','3');
insert into t_user_role values('3','2','1');

/**
  初始化权限信息
*/
insert into  t_permission values ('1','*','*');
insert into  t_permission values ('2','user:query','/user/query');
insert into  t_permission values ('3','user:delete','/user/delete');
insert into  t_permission values ('4','user:update','/user/update');
insert into  t_permission values ('5','user:add','/user/add');
insert into  t_permission values ('6','product:add','/product/add');
insert into  t_permission values ('7','product:query','/product/query');

/**
 初始化权限角色信息
   admin *
   user  user:add  user:delete  user:update  user:QUERY
   product   product:add product:query
 */
insert into t_role_permission values ('1','1','1');
insert into t_role_permission values ('2','3','2');
insert into t_role_permission values ('3','3','3');
insert into t_role_permission values ('4','3','4');
insert into t_role_permission values ('5','3','5');
insert into t_role_permission values ('6','2','6');
insert into t_role_permission values ('7','2','7');

-----
-- zhangsan user  product   user:*   product:add  product:query
-- lisi    admin       * 
