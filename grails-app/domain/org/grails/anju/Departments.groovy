package org.grails.anju

class Departments {

    String deptname

    static belongsTo = [ department: Departments ]

    static constraints = {
    }

    String toString() {
        deptname
    }
}
