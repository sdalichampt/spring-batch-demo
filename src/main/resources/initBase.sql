DROP TABLE djia IF EXISTS;

CREATE TABLE djia (
  date date NOT NULL PRIMARY KEY,
  open decimal(7,2) NOT NULL,
  high decimal(7,2) NOT NULL,
  low decimal(7,2) NOT NULL,
  close decimal(7,2) NOT NULL,
  volume decimal(11,0) NOT NULL,
  adjclose decimal(7,2) NOT NULL,
  direction char(8) NULL
);
