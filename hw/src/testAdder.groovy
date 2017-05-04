/**
 * Created by arvindsubramaniam on 4/18/17.
 */
import spock.lang.Specification

class testAdder extends spock.lang.Specification {
    def "adder-test"() {
        given: "a new Adder class is created"
        def adder = new Adder();
        expect: "Adding two numbers to return the sum"
        adder.add(3, 4) == 8
    }
}
