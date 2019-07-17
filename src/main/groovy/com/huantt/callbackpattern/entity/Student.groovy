package com.huantt.callbackpattern.entity

import groovy.transform.CompileStatic

/**
 * @author huantt on 2019-07-17
 */
@CompileStatic
class Student {

    String name
    int age

    void introduce(){
        println "$name - $age years old"
    }
}
