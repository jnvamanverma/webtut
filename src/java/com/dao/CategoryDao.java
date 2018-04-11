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
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
            public static Connection getConnection(){
                    Connection con=null;
                    try{
                            Class.forName("com.mysql.jdbc.Driver");
                            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webtut","root","12345");
                    }catch(Exception e){System.out.println(e);}
                    return con;
            }
            public static int save(Category c){
                    int status=0;
                    try{
                            Connection con=getConnection();
                            PreparedStatement ps=con.prepareStatement("insert into categories(name) values(?)");
                            ps.setString(1,c.getName());
                            status=ps.executeUpdate();
                    }catch(Exception e){System.out.println(e);}
                    return status;
            }
            public static int update(Category c){
                    int status=0;
                    try{
                            Connection con=getConnection();
                            PreparedStatement ps=con.prepareStatement("update categories set name=? where id=?");
                            ps.setString(1,c.getName());
                            ps.setInt(2,c.getId());
                            status=ps.executeUpdate();
                    }catch(Exception e){System.out.println(e);}
                    return status;
            }
            public static int delete(Category c){
                    int status=0;
                    try{
                            Connection con=getConnection();
                            PreparedStatement ps=con.prepareStatement("delete from categories where id=?");
                            ps.setInt(1,c.getId());
                            status=ps.executeUpdate();
                    }catch(Exception e){System.out.println(e);}

                    return status;
            }
            public static List<Category> getAllRecords(){
                    List<Category> list=new ArrayList<Category>();

                    try{
                            Connection con=getConnection();
                            PreparedStatement ps=con.prepareStatement("select * from categories");
                            ResultSet rs=ps.executeQuery();
                            while(rs.next()){
                                    Category c=new Category();
                                    c.setId(rs.getInt("id"));
                                    c.setName(rs.getString("name"));
                                    list.add(c);
                            }
                    }catch(Exception e){System.out.println(e);}
                    return list;
            }
            public static Category getRecordById(int id){
                    Category c=null;
                    try{
                            Connection con=getConnection();
                            PreparedStatement ps=con.prepareStatement("select * from categories where id=?");
                            ps.setInt(1,id);
                            ResultSet rs=ps.executeQuery();
                            while(rs.next()){
                                    c=new Category();
                                    c.setId(rs.getInt("id"));
                                    c.setName(rs.getString("name"));
                            }
                    }catch(Exception e){System.out.println(e);}
                    return c;
            }
            public static Category getRecordByName(String name){
                    Category c=null;
                    try{
                            Connection con=getConnection();
                            PreparedStatement ps=con.prepareStatement("select * from categories where name=?");
                            ps.setString(1,name);
                            ResultSet rs=ps.executeQuery();
                            while(rs.next()){
                                    c=new Category();
                                    c.setId(rs.getInt("id"));
                                    c.setName(rs.getString("name"));
                            }
                    }catch(Exception e){System.out.println(e);}
                    return c;
            }
}
