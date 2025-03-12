# Write your MySQL query statement below
SELECT 
    ROUND(COUNT(DISTINCT a.player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) AS fraction
FROM Activity a 
WHERE (a.player_id, ADDDATE(a.event_date, INTERVAL -1 DAY)) 
IN (SELECT player_id, MIN(event_date) FROM Activity GROUP BY player_id);
