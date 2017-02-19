CREATE TABLE DOCTORS (
  id         INTEGER(10),
  name VARCHAR(30),
  specialization VARCHAR(50),
  workload INTEGER(10),
  email  VARCHAR(50)
);
CREATE TABLE PATIENTS (
  id         INTEGER(10),
  name VARCHAR(30),
  DIAGNOSIS VARCHAR(50),
  email  VARCHAR(50)
);