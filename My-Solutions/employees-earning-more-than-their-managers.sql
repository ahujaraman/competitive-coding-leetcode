# Write your MySQL query statement below

select A.Name as Employee from employee as A join 
employee as B on A.ManagerId = B.Id
where A.Salary > B.Salary;
