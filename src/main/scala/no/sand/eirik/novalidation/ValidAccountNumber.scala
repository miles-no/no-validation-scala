package no.sand.eirik.novalidation

import java.lang.Character.getNumericValue

object ValidAccountNumber {
  def apply(accountNumber: String): Boolean = {
    if (accountNumber == null) return false

    val trimmed = accountNumber.replaceAll("""\.""", "")
    if (trimmed.length != 11) return false

    getNumericValue(trimmed.charAt(trimmed.length - 1)) == Mod11(trimmed)
  }
}
