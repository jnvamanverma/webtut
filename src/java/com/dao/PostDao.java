/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

/**
 *
 * @author jnvam
 */
import com.bean.Category;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.bean.Post;
public class PostDao {
    public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webtut","root","12345");
	}catch(ClassNotFoundException | SQLException e){System.out.println(e);}
	return con;
    }
    public static int save(Post p){
            int status=0;
            try{
                
                    Category c=CategoryDao.getRecordByName(p.getCategory());
                    p.setCatId(c.getId());
                    
                    Connection con=getConnection();
                    PreparedStatement ps=con.prepareStatement("insert into posts(category, title, body, author, tags) values(?,?,?,?,?)");
                    ps.setInt(1,p.getCatId());
                    ps.setString(2,p.getTitle());
                    ps.setString(3,p.getBody());
                    ps.setString(4,p.getAuthor());
                    ps.setString(5,p.getTags());
                    status=ps.executeUpdate();
            }catch(SQLException e){System.out.println(e);}
            return status;
    }
    public static int update(Post p){
            int status=0;
            try{
                    Category c=CategoryDao.getRecordByName(p.getCategory());
                    p.setCatId(c.getId());
                    
                    Connection con=getConnection();
                    PreparedStatement ps=con.prepareStatement("update posts set category=?,title=?,body=?,author=?,tags=? where id=?");
                    ps.setInt(1,p.getCatId());
                    ps.setString(2,p.getTitle());
                    ps.setString(3,p.getBody());
                    ps.setString(4,p.getAuthor());
                    ps.setString(5,p.getTags());
                    ps.setInt(6,p.getId());
                    status=ps.executeUpdate();
            }catch(SQLException e){System.out.println(e);}
            return status;
    }
    public static int delete(Post p){
            int status=0;
            try{
                    Connection con=getConnection();
                    PreparedStatement ps=con.prepareStatement("delete from posts where id=?");
                    ps.setInt(1,p.getId());
                    status=ps.executeUpdate();
            }catch(SQLException e){System.out.println(e);}

            return status;
    }
    public static List<Post> getAllRecords(){
            List<Post> list=new ArrayList<Post>();

            try{
                    Connection con=getConnection();
                    PreparedStatement ps=con.prepareStatement(
                            "SELECT posts.*, categories.name FROM posts INNER JOIN categories ON posts.category = categories.id");
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                            Post p=new Post();
                            p.setId(rs.getInt("id"));
                            p.setTitle(rs.getString("title"));
                            p.setAuthor(rs.getString("author"));
                            p.setCatId(rs.getInt("category"));
                            p.setBody(rs.getString("body"));
                            p.setTags(rs.getString("tags"));
                            p.setDate(rs.getDate("date"));
                            p.setCategory("name");
                            list.add(p);
                    }
            }catch(SQLException e){System.out.println(e);}
            return list;
    }
    public static Post getRecordById(int id){
            Post p=null;
            try{
                    Connection con=getConnection();
                    PreparedStatement ps=con.prepareStatement("select * from posts where id=?");
                    ps.setInt(1,id);
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                            p=new Post();
                            p.setId(rs.getInt("id"));
                            p.setTitle(rs.getString("title"));
                            p.setAuthor(rs.getString("author"));
                            p.setCatId(rs.getInt("category"));
                            p.setBody(rs.getString("body"));
                            p.setTags(rs.getString("tags"));
                            p.setDate(rs.getDate("date"));
                    }
            }catch(SQLException e){System.out.println(e);}
            return p;
    }
}
