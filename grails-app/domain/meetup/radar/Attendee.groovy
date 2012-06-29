package meetup.radar

class Attendee {

	String name
	String email

    static constraints = {
    	name blank: false
    	email email: true, blank: false
    }
}
