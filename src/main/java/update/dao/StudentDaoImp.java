package update.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import update.entites.Student;

public class StudentDaoImp implements StudentDao{

    private JdbcTemplate jdbcTemplate;

    @Override
    public int update(Student student)
    {
        String query = "update Student set name = ? ,city = ? where id = ? ";
        int res = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return res ;
    }

    @Override
    public int delete(int id)
    {
        String query = "Delete from Student where id = ?";
        int r = jdbcTemplate.update(query,id);
        return r;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
