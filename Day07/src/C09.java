/** <<데이터베이스: maria DB사용 >>



쿼리문



SHOW TABLES;
SELECT * FROM USER;
SELECT HOST, USER FROM USER;

--는 한줄 주석,       /* 여러줄 주석 */  



/*
  CRUD: Select, Update, Delete, Insert 




SELECT 컬럼목록(OR *) FROM 테이블명 (WHERE 옵션..)     
SELECT * FROM USER; -- user 테이블의 전체 컬럼 목록을 가지고 옴
SELECT HOST, USER FROM USER; -- user 테이블의 host, user 컬럼의 데이터만 가지고 옴


-- user 테이블에서 host가 127.0.0.1(자기자신)인 데이터만 들고오기     (where은 조건절)
SELECT * FROM user WHERE HOST = '127.0.0.1';

-- user 테이블에서 host가 127.0.0.1이거나 localhost인 데이터만 들고오기
SELECT * FROM user
WHERE HOST = '127.0.0.1' OR HOST = 'localhost'


-- user 테이블에서 host가 localhost 이고 select_priv 컬럼이 Y인 데이터만 들고오기
SELECT * FROM user
WHERE HOST = 'localhost' AND select_priv = 'Y'





-- 테스트를 위해 DB와 그 안에 테이블 만들기

-- 1. 데이터 베이스 만들기 (명령어:  CREATE DATABASE 데이터베이스명)
CREATE DATABASE javadb;

-- 2. javadb 사용 설정
USE javadb;

-- 3. 테이블 만들기 (명령어: CREATE TABLE 테이블명 (컬럼 정의)   )
javadbCREATE TABLE students (
    -- 컬럼명 / 데이터타입 / 옵션들
    student_id INT(9) NOT NULL, 
    student_name VARCHAR(100) NOT null

);


-- 4. student 테이블 구조확인
DESC students;

-- 5. students 테이블 데이터조회
SELECT * FROM students;


-- 6. 데이터 넣기 (명령어: Insert into 테이블명 (컬럼명) values (데이터..)   )
INSERT INTO students (student_id, student_name )
VALUES (1, '보라돌이1');
INSERT INTO students (student_id, student_name )
VALUES (2, '보라돌이2');
INSERT INTO students (student_id, student_name )
VALUES (3, '보라돌이3');


-- 7. 데이터 검색
SELECT * FROM students; 


-- 8. 데이터 변경 (명령어: UPDATE 테이블명 SET 컬럼명=값 WHERE OPTION... )  여기서 where 안쓰면 모든 컬럼에 영향(중요) 
UPDATE students SET student_name = '뚜비1' WHERE student_id = 1; 
UPDATE students SET student_name = '뚜비2' WHERE student_id = 2;
UPDATE students SET student_name = '뚜비3' WHERE student_id = 3;



-- 9. 데이터 삭제 (전체/ 행 일부)    일부삭제시 컬럼(열) 지우는거 아님  (명령어: DELETE FROM 테이블명 WHERE OPTIONS... )
-- ex. 학번이 1번보다 큰 학생을 다 지우려면
DELETE FROM students WHERE student_id > 1;

*
*
*
*
*/

