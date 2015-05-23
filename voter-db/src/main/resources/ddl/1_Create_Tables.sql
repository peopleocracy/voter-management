DROP TABLE IF EXISTS ppl_user.user;
DROP SEQUENCE IF EXISTS ppl_user.user_id_seq;
CREATE SEQUENCE ppl_user.user_id_seq;
CREATE TABLE ppl_user.user (
  id BIGINT PRIMARY KEY DEFAULT NEXTVAL('ppl_user.user_id_seq'),
  username VARCHAR(100) NOT NULL UNIQUE
);
