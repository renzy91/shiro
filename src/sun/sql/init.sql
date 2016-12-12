--�û���
CREATE TABLE t_user (
  id varchar(64) PRIMARY KEY,
  name varchar(64) ,
  password varchar(64) ,
  salt varchar(128)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
--��ɫ��
CREATE TABLE t_role (
  id varchar(64) primary key,
  name varchar(64)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
--�û���ɫ��
CREATE TABLE t_user_role (
  id varchar(64),
  userid varchar(64),
  roleid varchar(64) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
--Ȩ�ޱ�
CREATE TABLE t_permission (
  id varchar(64) primary key,
  code varchar(64),
  url varchar(64)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
--��ɫȨ�ޱ�
CREATE TABLE t_role_permission (
  id varchar(64) primary key,
  roleid varchar(64),
  permissionid varchar(64)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
