select * from artist;

select * from album;
/*
	If you ever want to display data from multiple tables together in
	a single result set you can do so by utilizing join statements
	
	join statements will allow you to make a select request for data
	from multiple tables, and then facilitate how that data is returned
	in the result set
*/


/*
	if you just say "join" it defaults to an inner join: this matches
	records in the result set on whatever your "on" statement is only
	if there is a match
*/
select * from artist 
join album on artist.ArtistId = album.ArtistId
order by artist.ArtistId ;

-- natural join will perform a similar action without needing to specify the "on" condition
select * from Artist
natural join album;

/*
	left join will return all records from the "left" table and 
	matching records from the "right" table. If there are no matching
	records then null values are provided
*/

select firstname, lastname, name from customer 
left join artist on customer.CustomerId = artist.ArtistId
order by customer.CustomerId ;

/*
	right join will return all records from the "right" table and 
	matching records from the "left" table. If there is no matching 
	records then null values are provided

*/
select firstname, lastname, name from customer 
right join artist on customer.CustomerId = artist.ArtistId
order by customer.CustomerId ;


/*
	similar to left/right joins, full outer will return all records
	from both tables and join any records that match, if there is no
	match then null values will be provided instead
*/
select firstname, lastname, name from customer 
full outer join artist on customer.CustomerId = artist.ArtistId
order by customer.CustomerId ;

















