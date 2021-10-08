
  CREATE TABLE "SYSTEM"."REALTIMEDI_SPRING_STUDENT" 
   (	"SNO" NUMBER, 
	"SNAME" VARCHAR2(30 BYTE), 
	"ADDRS" VARCHAR2(30 BYTE), 
	"TOTAL" FLOAT(126), 
	"AVG" FLOAT(126), 
	"RESULT" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
