-- SELECT 
--     MAX(months * salary) AS max_earnings,
--     COUNT(*)
-- FROM Employee
-- WHERE (months * salary) = (
--     SELECT MAX(months * salary)
--     FROM Employee
-- );

SELECT 
    months * salary AS earnings,
    COUNT(*)
FROM Employee
GROUP BY earnings
ORDER BY earnings DESC
LIMIT 1;

