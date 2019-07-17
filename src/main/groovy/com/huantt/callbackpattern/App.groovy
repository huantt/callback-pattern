package com.huantt.callbackpattern

import com.huantt.callbackpattern.entity.Student
import com.huantt.callbackpattern.io.MockedStudentRepository
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

/**
 * @author huantt on 2019-07-17
 */
@CompileStatic
@Slf4j
class App {

    public static void main(String[] args) {
        MockedStudentRepository repository = new MockedStudentRepository()

        repository.findAll(4, { List<Student> students ->
            students*.introduce()
        })
    }
}
