/* Write your PL/SQL query statement below */
select id, movie, description, rating
from Cinema
where MOD(id,2) <> 0 and description <> 'boring' 
order by rating desc;