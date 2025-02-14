package insertdao.settingup;

import insertdao.dao.StudentDaoImp;
import insertdao.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("firstconfig.xml");

//        JdbcTemplate jdbc = c.getBean("jdbcTemplate", JdbcTemplate.class);
//        String insert = "INSERT INTO Student (id, name, city) VALUES (101, 'Ritik', 'Ghaziabad')";
//        String insert1 = "insert into Student(id,name,city) VALUES (?,?,?)";
//        int res = jdbc.update(insert1,102,"Aman","Mumbai");
//        System.out.println("Number of rows affected :"+res);


        StudentDaoImp s = c.getBean("studentDao", StudentDaoImp.class);
        Student s1 = new Student(1002,"Tanu","UP");
        int r = s.insert(s1);
        System.out.println(r+"row affected");








    }
}