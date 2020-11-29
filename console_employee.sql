# 调用数据库
show databases ;

use employee;

show tables;

#新建种类表(位置)
create table tb_type
(
    t_id   int auto_increment
        primary key,
    t_name varchar(50) not null
)
    charset = utf8;

-- 添加测试数据
insert into tb_type(tname)values('战士');
insert into tb_type(tname)values('法师');
insert into tb_type(tname)values('射手');
insert into tb_type(tname)values('刺客');
insert into tb_type(tname)values('坦克');
insert into tb_type(tname)values('辅助');

# 新建英雄表
create table tb_hero(
    h_id int primary key auto_increment,
    h_name varchar(50) not null unique ,
    t_id int not null ,
    publish_time date not null,
    h_des text not null,
    h_pic varchar(50) not null default 'hello.jpg',
    constraint fk_tb_hero_tid foreign key(t_id) references tb_type(t_id)
)engine=innodb default charset=utf8;

# 为英雄表插入数据
insert into tb_hero(h_name,t_id,publish_time,h_des)
values('亚瑟',1,'2015-1-1','大宝剑');

insert into tb_hero(h_name,t_id,publish_time,h_des)
values('露娜',1,'2015-1-1','月下无限连');

insert into tb_hero(h_name,t_id,publish_time,h_des)
values('后裔',3,'2015-1-1','持续输出机器');


# 新建皮肤表
create table tb_skin
(
    s_id   int primary key auto_increment,
    s_name varchar(20)  not null,
    s_pic  varchar(100) not null default 'hello.jpg',
    h_id int,
    constraint fk_tb_skin_h_id foreign key(h_id) references tb_hero(h_id)
)engine=innodb default charset=utf8;

# 为皮肤表插入数据
insert into tb_skin(s_name,h_id) values('心灵战警',1);

# 新建用户表
create table tb_user(
    u_id int primary key auto_increment,
    username varchar(50) not null,
    password varchar(50) not null
)engine =innodb default charset=utf8;

# 删除用户表
# drop table tb_user;

# 为用户表添加数据
insert into tb_user(username,password)
values('user','root');


