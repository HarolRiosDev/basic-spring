DROP TABLE IF EXISTS COUNTRY;
CREATE TABLE IF NOT EXISTS COUNTRY(
  ID varchar2(3) not null DEFAULT '0',
  CODE_2 char(2) not null,
  CODE_3 char(3) not null,
  NAME varchar(100) not null,
  NATIONALITY varchar(39) not null,
  PRIMARY KEY ( ID )
);

DROP TABLE IF EXISTS USERS;
CREATE TABLE IF NOT EXISTS USERS(
  ID bigint  not null AUTO_INCREMENT,
  NAME varchar(100) not null,
  LAST_NAME varchar(100) not null,
  STATUS int,
  COUNTRY_ID int ,
  PRIMARY KEY ( ID ),
  FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRY(ID)
);

