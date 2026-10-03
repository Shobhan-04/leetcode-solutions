WITH CTE AS
(
    SELECT customer_id, COUNT(DISTINCT order_id) AS total_orders, 
    
    ROUND(COUNT(DISTINCT CASE
        WHEN TIME(order_timestamp) BETWEEN '11:00:00' AND '14:00:00' OR (TIME(order_timestamp) BETWEEN '18:00:00' AND '21:00:00')
            THEN order_id
        ELSE 
            NULL
        END) / COUNT(DISTINCT order_id) * 100)
    AS peak_hour_percentage, 

    ROUND(AVG(order_rating), 2) AS average_rating,

    COUNT(DISTINCT CASE 
        WHEN order_rating IS NOT NULL 
            THEN order_id
        ELSE 
            NULL
        END) / COUNT(DISTINCT order_id)
    AS orders_rated

    FROM restaurant_orders

    GROUP BY customer_id 
)

SELECT c.customer_id, c.total_orders, c.peak_hour_percentage, c.average_rating

FROM CTE AS c

WHERE c.total_orders >= 3 -- Made at least 3 orders.
AND c.peak_hour_percentage >= 60 -- At least 60% of their orders are during peak hours (11:00-14:00 or 18:00-21:00).
AND c.average_rating >= 4.0 -- average rating for rated orders is at least 4.0
AND c.orders_rated >= 0.5 -- Have rated at least 50% of their orders.

GROUP BY c.customer_id, c.total_orders, c.peak_hour_percentage, c.average_rating
ORDER BY average_rating DESC, customer_id DESC;