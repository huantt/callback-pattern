package com.huantt.callbackpattern.io

import com.huantt.callbackpattern.commons.Callback
import com.huantt.callbackpattern.entity.Student
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

/**
 * @author huantt on 2019-07-17
 */
@CompileStatic
@Slf4j
class MockedStudentRepository {

    private static final int NUMBER_OF_PAGE = 10
    private static Random random = new Random()

    void findAll(int batchSize, Callback<List<Student>> callback) {
        int page = 0
        while (page < NUMBER_OF_PAGE) {
            log.debug("Page index: {}", page)
            List<Student> students = this.mockStudents(batchSize)
            callback.callback(students)
            page++
        }
    }

    private List<Student> mockStudents(int size) {
        List<Student> students = new ArrayList<>()
        for (int i = 0; i < size; i++) {
            students.add(
                    new Student(
                            name: "Mocked student",
                            age: random.nextInt(30)
                    )
            )
        }
        return students
    }
}
