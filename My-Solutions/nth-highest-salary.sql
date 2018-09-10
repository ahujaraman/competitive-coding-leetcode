CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE v1 INT;
    SET v1 := N-1;
  RETURN (
      
      select distinct salary from employee
      order by salary DESC 
      limit 1 OFFSET v1
      
  );
END
