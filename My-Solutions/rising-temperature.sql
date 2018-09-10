# Write your MySQL query statement below
select b.Id from weather  as a
join weather as b 
on DATEDIFF(b.RecordDate,a.RecordDate) =1
and b.Temperature > a.Temperature;
