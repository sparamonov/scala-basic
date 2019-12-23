package main

import scala.util.matching.Regex

class Email private (val underlying: String) {
    override def toString(): String = underlying
}

object Email {

    def apply(email: String): Email = {
        require(email != null && email.trim() != null)
        require(verifyEmailFormat(email))
        new Email(email)
    }

    def verifyEmailFormat(email: String): Boolean = {
        val pattern: Regex = """^[a-zA-Z0-9\.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""".r
        pattern.matches(email)
    }
}