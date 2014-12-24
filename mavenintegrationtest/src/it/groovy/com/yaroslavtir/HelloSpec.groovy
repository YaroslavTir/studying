package com.yaroslavtir

import spock.lang.Specification

/**
 *
 *
 * @author YMolodkov
 * @since 16.0
 */
class HelloSpec extends Specification{

    def "check hello"(){
        setup:
            def  guest = new Guest()
            def hello = new Hello()
        expect:
            expectedStr == hello.sayHello(guest.retrieveName(name))
        where:
            name     | expectedStr
            "bilbo"  | "hi Bender bilbo"
            "hobbit" | "hi Bender hobbit"
    }
}
