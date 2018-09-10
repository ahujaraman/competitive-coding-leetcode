
select C.name as Department, A.name as Employee, A.salary from employee as A
join 
(select max(Salary) as max_salary,departmentid from employee 
group by departmentid) as B
on A.salary = B.max_salary and A.departmentid = B.departmentid
join department as C 
on A.departmentid = C.id;
