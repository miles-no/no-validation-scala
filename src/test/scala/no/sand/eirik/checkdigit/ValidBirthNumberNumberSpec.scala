package no.sand.eirik.checkdigit

import org.scalatest.FunSpec

class ValidBirthNumberNumberSpec extends FunSpec {
  val invalidBirthNumber = "14031699931"
  val validBirthNumber = "14031699933"

  describe("Validation of birth number") {
    it("returns false if birth number is invalid") {
      assert(ValidBirthNumber(invalidBirthNumber) === false)
    }

    it("returns true if birth number is valid") {
      assert(ValidBirthNumber(validBirthNumber))
    }
  }
}
