### mapper01

#### Checks

+ Naming arguments (consistency/conventions)
+ Code style
+ Null checks
+ JSR-305 @Notnull @Nullable
+ Dependency injection
+ Generic Parameters
+ assertThat(actual).isEqualTo(expected);
+ Data providers - separate the test data from test methods, reuse
+ Guava Test Library - NullPointerTester
+ Spring dependency, we don't have to use Spring Stereotype Annotations, use JSR-330 or even your own meta "qualifier" annotations
+ Domain modelling, "tiny types" e.g Postcode(valid) DateOfBirth(iso toString)