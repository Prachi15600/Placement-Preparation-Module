/* Write your T-SQL query statement below */
SELECT a1.machine_id, ROUND(AVG(a1.timestamp - a2.timestamp),3) AS processing_time
FROM Activity a1
JOIN Activity a2  ON a1.machine_id = a2.machine_id
WHERE a2.activity_type = 'start' AND a1.activity_type = 'end'
GROUP BY a1.machine_id