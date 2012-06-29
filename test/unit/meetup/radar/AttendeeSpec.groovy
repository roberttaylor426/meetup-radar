package meetup.radar

import grails.test.mixin.TestFor
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
 @TestFor(Attendee)
class AttendeeSpec extends Specification {

	def attendee

	def setup() {
		attendee = new Attendee(name:'name', email:'rob@taylor.com')
		//assert attendee.validate()
	}

	void "should have name"() {
		given:
		attendee.name = ''

		expect:
		!attendee.validate()
		attendee.errors['name'].code == 'blank'
	}

	void "should have a valid email address"() {
		given:
		attendee.email = 'invalid_email_address'

		expect:
		!attendee.validate()
		attendee.errors['email'].code == 'email.invalid'
	}

	void "should have an email address"() {
		given:
		attendee.email = ''

		expect:
		!attendee.validate()
		attendee.errors['email'].code == 'blank'
	}

}