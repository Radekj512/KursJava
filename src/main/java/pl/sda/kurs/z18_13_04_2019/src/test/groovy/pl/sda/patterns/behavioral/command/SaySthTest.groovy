package pl.sda.patterns.behavioral.command

import spock.lang.Specification

class SaySthTest extends Specification {
    def "test justSayIt"() {
        given:
            SaySth say = new SaySth()
        expect:
            word == say.justSayIt(o)
        where:
            word   | o
            "hi!"  | new SayHi()
            "no!"  | new SayNo()
            "yes!" | new SayYes()
    }
}
