CREATE TABLE Location (
  id serial NOT NULL,
  dest varchar(64) DEFAULT NULL,
  address varchar(128) DEFAULT NULL,
  member varchar(128) DEFAULT NULL,
  PRIMARY KEY (id)
)