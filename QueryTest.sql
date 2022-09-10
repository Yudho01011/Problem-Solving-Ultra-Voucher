select id, name, 
	CASE parent_id
    WHEN 1 THEN 'zaki'
    WHEN 2 THEN 'ilham'
    WHEN 3 THEN 'irwan'
    WHEN 4 THEN 'arka'
    END as parent_name
from testing;
