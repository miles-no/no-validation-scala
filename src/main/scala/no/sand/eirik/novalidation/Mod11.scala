package no.sand.eirik.novalidation

import java.lang.Character.getNumericValue

object Mod11 {
  def apply(value: String): Int = {
    var (sumForMod, controlNumber, chars, i) = (0, 2, value.toCharArray, value.toCharArray.length - 2)

    while (i >= 0) {
      sumForMod += (getNumericValue(chars(i)) * controlNumber)
      controlNumber += 1
      if (controlNumber > 7) controlNumber = 2
      i -= 1
    }

    val calculus = 11 - sumForMod % 11
    if (calculus == 11) 0 else calculus
  }
}
