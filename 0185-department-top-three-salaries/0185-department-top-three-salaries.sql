# Write your MySQL query statement below
with cte as (
    SELECT departmentId as id,
           name as Employee,
           salary,
           dense_rank() over(partition by departmentId order by salary DESC) as rk
    FROM Employee 
)
SELECT d.name as Department, Employee, salary FROM cte
JOIN Department d ON cte.id = d.id
WHERE rk <= 3