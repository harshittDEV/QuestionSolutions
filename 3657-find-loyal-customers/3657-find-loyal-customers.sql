# Write your MySQL query statement below
select customer_id from customer_transactions group by customer_id having
sum(transaction_type = 'purchase')>=3 and
DATEDIFF(MAX(transaction_date), MIN(transaction_date)) > 29 and
(sum(transaction_type='refund')*100/count(transaction_id))<20;