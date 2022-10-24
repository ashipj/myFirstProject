package org.grails.anju

class Profile {
    String name
    String empcode
    String department

    static constraints = {

        empcode maxSize: 255
        name inList: ['Anju', 'Ashish', 'Akku','Kunjayi']
        department nullable: true

    }
}
