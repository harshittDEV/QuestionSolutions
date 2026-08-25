# Write your MySQL query statement below
SELECT d.name AS Department,e.name AS Employee,e.Salary AS Salary FROM  Employee AS e  JOIN Department AS d ON e.departmentId=d.id WHERE  e.Salary=(SELECT MAX(e1.Salary)
FROM Employee AS e1
WHERE e.departmentId=e1.departmentId);

