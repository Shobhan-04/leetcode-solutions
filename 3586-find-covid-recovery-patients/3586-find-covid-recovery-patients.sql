
WITH CTE AS
(
    SELECT *, ROW_NUMBER() OVER(PARTITION BY patient_id, result 
    ORDER BY test_date) AS rnk1   
    FROM covid_tests
),

CTE2 AS (
    SELECT c1.patient_id, ROW_NUMBER() OVER(PARTITION BY c1.patient_id ORDER BY c2.test_date) AS rnk2, DATEDIFF(c2.test_date, c1.test_date) AS recovery_time
    FROM CTE c1

    LEFT JOIN CTE c2 # Self Join
    ON c1.patient_id = c2.patient_id
    AND c1.test_date < c2.test_date

    WHERE c1.result = 'Positive'
    AND c1.rnk1 = 1
    AND c2.result = 'Negative'
)

SELECT cte2.patient_id, p.patient_name, p.age, cte2.recovery_time
FROM CTE2 AS cte2

LEFT JOIN patients AS p 
ON cte2.patient_id = p.patient_id
WHERE cte2.rnk2 = 1

ORDER BY cte2.recovery_time ASC, p.patient_name ASC;