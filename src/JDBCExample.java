//package db_projets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
     public static void main(String []args){
          String user = "root";								//Логин пользователя
          String password = "toor";							//Пароль пользователя
          String url = "jdbc:mysql://localhost:3306/studR";	//URL адрес
          String driver = "com.mysql.jdbc.Driver";			//Имя драйвера
          try {
               Class.forName(driver);//Регистрируем драйвер
          } catch (ClassNotFoundException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
          }
          Connection c = null;//Соединение с БД
          try{
               c = DriverManager.getConnection(url, user, password);//Установка соединения с БД
               Statement st = c.createStatement();//Готовим запрос
               ResultSet rs = st.executeQuery("select * from stud");//Выполняем запрос к БД, результат в переменной rs
               while(rs.next()){
                    System.out.println(rs.getString("lname"));//Последовательно для каждой строки выводим значение из колонки ColumnName
               }
          } catch(Exception e){
               e.printStackTrace();
          }
          finally{
               //Обязательно необходимо закрыть соединение
               try {
                    if(c != null)
                    c.close();
               } catch (SQLException e) {
                    e.printStackTrace();
               }
          }
     }
}