package com.fernando

import geb.spock.GebSpec
import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration

/**
 * See https://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class GrailscodenarcSpec extends GebSpec {

    void "test something"() {
        when: 'The home page is visited'
            go '/'

        then: 'The title is correct'
            title == 'Welcome to Grails'
    }

}
