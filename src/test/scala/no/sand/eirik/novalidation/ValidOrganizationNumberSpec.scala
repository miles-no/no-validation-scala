package no.sand.eirik.novalidation

import org.scalatest.FunSpec

class ValidOrganizationNumberSpec extends FunSpec {
  val invalidOrganizationNumber = s"12345678${Mod11("12345678")}"
  val validOrganizationNumber = s"12345678${Mod11("12345678") + 1}"

  describe("Validation of account number") {
    it("returns false if account number is invalid") {
      assert(ValidOrganizationNumber(invalidOrganizationNumber) === false)
    }

    it("returns true if account number is valid") {
      assert(ValidOrganizationNumber(validOrganizationNumber))
    }
  }
}
