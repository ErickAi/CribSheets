-----SQL create DB and add a таблицаs------------------------------------------------------------------|	
CREATE DATABASE таблица;				--создать базу
DROP DATABASE таблица;					--удалить базу

DROP TABLE IF EXISTS таблица;
DROP SEQUENCE IF EXISTS name_of_sequence;

CREATE SEQUENCE name_of_sequence START 10000;

CREATE TABLE таблица
(
----column			тип_данных		not_null requiremenst
	id				INTEGER PRIMARY KEY DEFAULT nextval ('name_of_sequence'),
	колонка			varchar(50)		NOT NULL,
	колонка			varchar			,
	колонка			int
);
-----SQL adding to DB--------------------------------------------------------------------------------|	
ALTER TABLE	таблица	ADD колонка тип_данных;					--добавить/удалить/модифицировать колонку
INSERT INTO таблица (колонка, колонка)	VALUES('знач', знач);--вставить строку с данными

UPDATE таблица 	SET колонка = 'знач', колонка = знач		--добавить данные
				WHERE колонка = знач OR колонка = знач;		--в существующие колонки

DELETE FROM таблица		WHERE колонка = 'знач';				--удалить данные по фильтру

-----SQL querry for DB-------------------------------------------------------------------------------|	
таблица movies
		колонка		колонка		колонка		колонка
		
			id		title		genre		duration			
string		1		Metropolis	Sci-Fi		153
string		2		Nosfreatu	Horror		94
string		3		The Kid		Comedy		68
string		4		The Hobbit	Fantasy		95

SELECT колонка	FROM таблица	(WHERE колонка='знач');

SELECT * 		FROM movies 	WHERE genre='Fantasy';		
строка--	4		The Hobbit	Fantasy		95		--

SELECT title, genre	FROM movies WHERE id = 2;
строка--			Nosfreatu	Horror				--

SELECT genre	FROM movies 	WHERE title='The Kid';
строка--						Comedy				--
		
SELECT duration	FROM movies;
строка--									153		--
строка--									94		--
строка--									68		--
строка--									95		--

SELECT колонка	FROM таблица	WHERE колонка = 'знач';	--фильтрация по параметру
SELECT колонка	FROM таблица	WHERE колонка =>'знач';	--фильтрация от параметра
SELECT колонка	FROM таблица	WHERE колонка <>'знач';	--исключение по параметру
SELECT колонка	FROM таблица	WHERE колонка ='знач' AND колонка ='знач';
												--фильтрация по нескольким параметрам
SELECT колонка	FROM таблица	WHERE колонка ='знач' OR	 колонка ='знач';
												--фильтрация по объединяющим параметрам
SELECT колонка	FROM таблица	ORDER BY колонка;			--сортировка по параметрам
SELECT колонка	FROM таблица	ORDER BY колонка DESC;		--обратная сортировка













































