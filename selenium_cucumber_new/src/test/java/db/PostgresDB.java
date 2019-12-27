package db;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PostgresDB {
public static void main(String[] args) throws SQLException {
	String url="jdbc:postgresql://192.168.99.100:5433/dvdrental";
	String user="postgres";
	String pwd="1234";
	Connection connection =DriverManager.getConnection(url, user, pwd);
	Statement statement=connection.createStatement();
//	ResultSet result = statement.executeQuery("select * from actor");
//	List <String> firstNames = new ArrayList <String>();
//	List <String> lastNames = new ArrayList <String>();
//	List <Integer> id = new ArrayList <Integer>();
//	while(result.next()) {
//	//System.out.println(result.getString("first_name"));
//		firstNames.add(result.getString("first_name"));
//		lastNames.add(result.getString("3"));
//		id.add(Integer.valueOf(result.getString("actor_id")));
//
//	}
//	System.out.println(firstNames);
//	System.out.println(firstNames.get(5));

//    System.out.println(result.getMetaData().getColumnCount());	
//    System.out.println(result.getMetaData().getColumnName(2));
    
//    List list = resultSetToArrayList(result);
//    System.out.println(list);
//	ResultSet actorAndFilmActor = statement.executeQuery("select first_name, last_name, film_id, actor.actor_id\r\n" + 
//			"from actor\r\n" + 
//			"INNER JOIN film_actor\r\n" + 
//			"ON actor.actor_id = film_actor.actor_id;");
//	while (actorAndFilmActor.next()) {
//		System.out.println(actorAndFilmActor.getString("film_id"));
//	}
	//int update = statement.executeUpdate("insert into actor (actor_id, first_name, last_name)\r\n" + 
	//		"values(205, 'Javid', 'Nasibov')");
	int delete = statement.executeUpdate("DELETE FROM actor WHERE first_name = 'Javid';");
	
	
	
	
	
	
	
	
	
	
	
}
public static List resultSetToArrayList(ResultSet rs) throws SQLException{
	  ResultSetMetaData md = rs.getMetaData();
	  int columns = md.getColumnCount();
	  ArrayList list = new ArrayList(50);
	  while (rs.next()){
	     HashMap row = new HashMap(columns);
	     for(int i=1; i<=columns; ++i){           
	      row.put(md.getColumnName(i),rs.getObject(i));
	     }
	      list.add(row);
	  }

	 return list;
	}
}
