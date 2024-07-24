package streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumAverageGrade {
    public static void main(String[] args) {
        List<Student> studentList=List.of(
            new Student("Rohit", 85),
            new Student("Rahul", 80),
            new Student("Amit", 85),
            new Student("Rohit", 90)
        );

        int maxAverage=studentList.stream()
                .collect(Collectors.groupingBy(Student::getName,Collectors.averagingInt(Student::getMarks)))
                .values()
                .stream()
                .mapToInt(Double::intValue)
                .max()
                .orElse(0);
        System.out.println("maxAverage\t"+maxAverage);


    }
}
