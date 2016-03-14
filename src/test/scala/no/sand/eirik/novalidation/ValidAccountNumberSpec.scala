package no.sand.eirik.novalidation

import org.scalatest.FunSpec

class ValidAccountNumberSpec extends FunSpec {
  val invalidAccountNumber = s"1234567890${Mod11("1234567890")}"
  val validAccountNumber = s"1234567890${Mod11("1234567890") + 1}"

  describe("Validation of account number") {
    it("returns false if account number is invalid") {
      assert(ValidAccountNumber(invalidAccountNumber) === false)
    }

    it("returns true if account number is valid") {
      assert(ValidAccountNumber(validAccountNumber))
    }
  }
}
