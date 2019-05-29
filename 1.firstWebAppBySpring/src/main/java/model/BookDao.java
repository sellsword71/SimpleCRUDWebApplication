package model;

import entities.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Book b){
        int result = 0;
            String sql = "insert into availablebooks(writer, title) values ('" + b.getWriter() + "', '" + b.getTitle() + "')";
            result = template.update(sql);
        return result;
    }

    public int update(Book b){
        int result = 0;
        String sql = "update availablebooks set writer='" + b.getWriter() + "', " +
                "title='" + b.getTitle() + "' where id=" +b.getId();
        result = template.update(sql);
        return result;
    }

    public int delete(int id) {
        int result = 0;
        String sql = "delete from availablebooks where id=" + id;
        result = template.update(sql);
        return result;
    }

    public Book getBookById(int id) {
        String sql = "select * from availablebooks where id=?";
        Book book = template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Book>(Book.class));
        return book;
    }
    public List<Book> getAllBooks(){
        String sql = "select * from availablebooks order by id";
        return template.query(sql, new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setId(resultSet.getInt(1));
                book.setWriter(resultSet.getString(2));
                book.setTitle(resultSet.getString(3));
                return book;
            }
        });
    }
}

