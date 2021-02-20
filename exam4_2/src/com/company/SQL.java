package com.company;
import java.sql.*;

public class SQL {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "663857";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Success");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }

    public static void getNews(int id) {
        String sql = "select title, text, published from news where id = ?";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Title: " + rs.getString("title") + "\nText: " + rs.getString("text")
                        + "\nDate: " + rs.getDate("published"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean addNews(News news) {
        java.util.Date myDate = new java.util.Date(String.valueOf(news.getTime()));
        java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

        String sql = "insert into news(title, text, published) " + "VALUES(?, ?, ?)";
        int result = 0;

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) { // Я знаю,что такая форма со временем не правильная, но хотел спросить почем.
            stmt.setString(1, news.getTitle());         // В SQL создаётся перменная date, в конструкторе новостей переменная LocalDateTime,
            stmt.setString(2, news.getText());          // которая выше оборачивается JAVA'вским date, где string строка превращается
            stmt.setDate(3, sqlDate);                   //  в date и потом он же создаётся в sql date, что, по идее, должно работать?
            result = stmt.executeUpdate();                          // Гайд по этому нашёл в интернете, но интересно как его довести до ума
        }

        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

    public static void deleteNews(int id) {
        String sql = "delete from news where id = ?";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            System.out.println("Deleted");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean rewrite(int id, String newTitle, String newText){
        String sql = "update news" + "set title = ? and text = ?" + "WHERE id = ?";
        int result = 0;

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, newTitle);
            stmt.setString(2, newText);
            stmt.setInt(3, id);   // Выдаёт ошибку на счёт первого "=" в строке sql. Но в остольном вроде всё правильно

            result = stmt.executeUpdate();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }
}
