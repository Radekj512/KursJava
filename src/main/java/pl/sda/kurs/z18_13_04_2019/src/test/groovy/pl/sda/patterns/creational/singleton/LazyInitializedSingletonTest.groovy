package pl.sda.patterns.creational.singleton

import spock.lang.PendingFeature
import spock.lang.Specification

class LazyInitializedSingletonTest extends Specification {

    @PendingFeature
    def "Should return singleton instance of PropertyLoader class"() {

        when:
        def instance = LazyInitializedSingleton.getInstance()
        def instance2 = LazyInitializedSingleton.getInstance()

        then:
        instance.getDb() == 'test'
        instance.getPassword() == 'test123'
        instance.getUser() == 'test'
        instance.getAddress() == '127.0.0.1'
        instance == instance2
    }
}
