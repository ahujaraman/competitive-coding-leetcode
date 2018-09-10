# Write your MySQL query statement below
delete from person  where id not in ( SELECT * FROM  ( select min(id) from person 
group by email) as der)  ;
