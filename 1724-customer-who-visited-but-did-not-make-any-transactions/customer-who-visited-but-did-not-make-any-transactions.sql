# Write your MySQL query statement below
select v.customer_id as customer_id ,count(*) as count_no_trans
from Visits v LEft join Transactions t
ON v.visit_id =t.visit_id
where t.transaction_id is null
Group by customer_id;




