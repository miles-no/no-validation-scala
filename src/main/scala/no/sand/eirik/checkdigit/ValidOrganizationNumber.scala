package no.sand.eirik.checkdigit

import java.lang.Character.getNumericValue

object ValidOrganizationNumber {
  def apply(organizationNumber: String): Boolean = {
    if (organizationNumber == null || organizationNumber.length != 9) return false

    getNumericValue(organizationNumber.charAt(organizationNumber.length - 1)) == Mod11(organizationNumber)
  }
}
