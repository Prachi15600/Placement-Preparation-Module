SELECT 
    p.product_id, 
    IFNULL(ROUND(SUM(p.price * u.units) / SUM(u.units), 2), 0) AS average_price
FROM 
    Prices p
LEFT JOIN 
    UnitsSold u
ON 
    p.product_id = u.product_id
    AND p.start_date <= u.purchase_date
    AND p.end_date >= u.purchase_date
GROUP BY 
    p.product_id;
