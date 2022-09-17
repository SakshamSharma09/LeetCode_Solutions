# Write your MySQL query statement below
SELECT
    Customers.name AS Customers
FROM
    Customers
WHERE
    id NOT IN(SELECT customerId FROM Orders);
;