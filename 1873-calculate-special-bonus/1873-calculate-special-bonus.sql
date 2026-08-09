# Write your MySQL query statement below
Select employee_id,
IF(employee_id%2=0 or name Like 'M%',0,salary)as bonus
from Employees
order by employee_id;
