package update.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import update.dao.StudentDaoImp;
import update.entites.Student;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("updateconfig.xml");
        StudentDaoImp sd = c.getBean("sDao",StudentDaoImp.class);
        //tho we dont need setter ethod in student as we using constructor to set vales and ico ocntakner to create objects

        Student s = new Student(101,"Manna","Uttarakhand");
        System.out.println("Updated rows :" +sd.update(s));

        System.out.println("Deleted rows : "+ sd.delete(103));


    }
}
