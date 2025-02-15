package update.dao;

import update.entites.Student;

public interface StudentDao {
    public int update(Student student);
    public int delete(int id);
}
