package no.sand.eirik.checkdigit

import java.lang.Character.getNumericValue

object ValidBirthNumber {
  def apply(birthNumber: String): Boolean = {
    if (birthNumber == null || birthNumber.length != 11) return false

    val checksum1 = checksum(birthNumber, 3, 7, 6, 1, 8, 9, 4, 5, 2)
    val checksum2 = checksum(birthNumber, 5, 4, 3, 2, 7, 6, 5, 4, 3, 2)

    checksum1 == getNumericValue(birthNumber.charAt(9)) && checksum2 == getNumericValue(birthNumber.charAt(10))
  }

  def checksum(birthNumber: String, factors: Int*): Int = {
    11 - (sum(birthNumber, factors: _*) % 11) match {
      case 11 => 0
      case value => value
    }
  }

  def sum(birthNumber: String, factors: Int*): Int = {
    factors.zipWithIndex.map({ case (factor, index) => getNumericValue(birthNumber.charAt(index)) * factor }).sum
  }
}
