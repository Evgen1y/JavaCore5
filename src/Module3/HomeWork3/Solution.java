package Module3.HomeWork3;

import sun.util.calendar.BaseCalendar;

import java.util.Date;

/**
 * Created by bulov on 12.11.2016.
 */
public class Solution {

    public static void main(String[] args) {
        Date start1 = new Date("10/20/2016");
        Date start2 = new Date("01/20/2017");

        Course philosophyCourse = new Course(start1, "PhilosophyCourse");
        Course spainCourse = new Course(start2, "SpainCourse");
        Course englishCourse = new Course(40, "EnglishCourse", "Svetlana Makar");
        Course logicCourse = new Course(25, "LogicCourse", "Anton Leonov");
        Course arithmeticCourse = new Course(56, "ArithmeticCourse", "Vitaliy Boruz");

        Course[] coursesTaken = {philosophyCourse, spainCourse, englishCourse, logicCourse, arithmeticCourse};

        Student zaharov = new Student("Vitaliy", "Zaharov", 1);
        Student bajaeva = new Student("Bajaeva", coursesTaken);

        CollegeStudent ostatina = new CollegeStudent("Olya", "Ostanina", 2);
        CollegeStudent tretyak = new CollegeStudent("Tretyak", coursesTaken);
        CollegeStudent ostanina2 = new CollegeStudent("DIPT", 82, 9584);

        SpecialStudent volkov = new SpecialStudent("Sergey", "Volkov", 1);
        SpecialStudent pugaj = new SpecialStudent("Pugaj", coursesTaken);
        SpecialStudent yakovenko = new SpecialStudent(12345678);
    }
}
