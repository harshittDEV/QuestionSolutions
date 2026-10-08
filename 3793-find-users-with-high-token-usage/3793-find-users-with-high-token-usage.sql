# Write your MySQL query statement below
select user_id,count(prompt) as prompt_count,round(avg(tokens),2) as avg_tokens from prompts 
group by user_id 
having count(user_id)>=3 and avg(tokens)<max(tokens)
order by avg_tokens desc ,user_id asc;