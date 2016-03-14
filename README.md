# no-validation-scala

This is a scala-port of the [no-validation javascript library](http://miles.no/blogg/validering-av-norske-data).

## TODO
* Implement KID-number validation
* Scalafizy the code a bit

## Account Number
```scala
val validAccountNumber: Boolean = ValidAccountNumber("12345678903")
```

## Organization Number
```scala
val validOrganizationNumber: Boolean = ValidOrganizationNumber("123456785")
```

## Birth Number
```scala
val validBirthNumber: Boolean = ValidBirthNumber("14031699933")
```

## KID Number
TODO
