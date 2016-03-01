### mapper01

#### Checks

+ Naming arguments (consistency/conventions)
+ Code style
+ Null checks at create
+ JSR-305 @Notnull @Nullable
+ Dependency injection
+ Generic Parameters
+ assertThat(actual).isEqualTo(expected);
+ Java 8 Collections/Stream/Map is it preferred over idiomatic loop?
+ Data providers - separate the test data from test methods, reuse
+ Guava Test Library - NullPointerTester works with @Notnull @Nullable
+ Spring - we don't have to use Spring Stereotype Annotations, use JSR-330 or even your own meta "qualifier" annotations
+ Domain modelling, "tiny types" e.g. Postcode(validate), Money(rounding), DateOfBirth(birthday, age, format)
+ Immutable - defensive copy
+ Mapper Item - Data Transfer Objects (manual). Serialize. Proto-buffer, JSON, XML or generated classes mapping - version resilience