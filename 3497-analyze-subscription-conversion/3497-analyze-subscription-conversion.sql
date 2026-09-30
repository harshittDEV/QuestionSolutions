# Write your MySQL query statement below
select 
user_id,
round(avg(
    case when activity_type='free_trial' then activity_duration END),2) as trial_avg_duration,
round(avg(
    case when activity_type='paid' then activity_duration END),2)as 
    paid_avg_duration
from UserActivity
group by user_id
HAVING SUM(activity_type = 'paid') > 0 and SUM(activity_type = 'free_trial')>0;

