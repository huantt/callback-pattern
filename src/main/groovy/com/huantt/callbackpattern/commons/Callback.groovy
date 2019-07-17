package com.huantt.callbackpattern.commons

import groovy.transform.CompileStatic

/**
 * @author huantt on 2019-07-17
 */
@CompileStatic
@FunctionalInterface
interface Callback<M> {

    void callback(M model)

}
