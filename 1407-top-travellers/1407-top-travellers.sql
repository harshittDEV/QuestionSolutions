# Write your MySQL query statement below
select distinct(u.name),case when r.user_id is not null then sum(distance) over(partition by r.user_id order by r.user_id)
else 0
end as travelled_distance
from Users u
left join Rides r
on r.user_id=u.id
order by travelled_distance desc,u.name asc